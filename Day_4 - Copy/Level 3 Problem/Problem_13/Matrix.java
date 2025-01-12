import java.util.*;
public class Matrix {
    public static int[][] MatrixAddition(int[][] matrixA ,int[][] matrixB ){
        int row = matrixA.length;
        int col = matrixA[0].length;
        int[][] addMatrix = new int[row][col];
        for(int i=0; i<row;i++){
            for(int j=0; j<col;j++){
             addMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return addMatrix;
    }

    public static int[][] MatrixSubstraction(int[][] matrixA ,int[][] matrixB ){
        int row = matrixA.length;
        int col = matrixA[0].length;
        int[][] subMatrix = new int[row][col];
        for(int i=0; i<row;i++){
            for(int j=0; j<col;j++){
             subMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return subMatrix;
    }

    public static int[][] MultiplyMatrix(int[][] matrixA ,int[][] matrixB){
        int rowA = matrixA.length;
        int colA = matrixA[0].length;
        int rowB = matrixB.length;
        int colB = matrixB[0].length;
        if(colA != rowB){
            System.out.println("Matrix must be an square matrix");
        }
        int[][] mutliplyResult = new int[rowA][colA];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                for (int k = 0; k < rowB; k++) {
                    mutliplyResult[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return mutliplyResult;
    }

    public static int[][] transposeMatrix(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;
    }

    public static int determinant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            System.err.println("Array must be of 2 * 2");
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
     // Method to find the determinant of a 3x3 matrix
     public static int determinant3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            System.out.println("Matrix must be 3x3");
        }
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) 
               - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) 
               + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Take the value of row from user
        System.out.println("Enter the value of rows");
        int row = sc.nextInt();
        //Take value of column from user
        System.out.println("Enter the value of column");
        int col = sc.nextInt();

        int [][] matrixA = new int[row][col];
        int [][] matrixB = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                 
                //Take value of matrix A
                System.out.println("Enter the value in matrix A");
                matrixA[i][j] = sc.nextInt();
                System.out.println("Enter the value in matrix B");
                //Take value of matrix B from user
                matrixB[i][j] = sc.nextInt();   
            }
        }
          //Fuction call for Substraction of matrix and store result in variable
        int total[][] = MatrixAddition(matrixA , matrixB);
        System.out.println("Result of the Addition of matrix");

        for(int[] rows : total){
            for(int val : rows){
                System.out.print( val + " ");
            }
            System.out.println();
        }
         
        //Fuction call for Substraction of matrix and store result in variable
        int resultOfSubstraction[][] = MatrixSubstraction(matrixA , matrixB);
        System.out.println("Result of substraction of matrix");
        
        for(int[] rows : resultOfSubstraction){
            for(int val : rows){
                System.out.print( val + " ");
            }
            System.err.println();
        }
         
        //Fuction call for mutiplyMatrix and store result in variable
        int resultOfMultiplication[][] = MultiplyMatrix(matrixA , matrixB);
        System.out.println("Result of multiplication of matrix");

        for(int[] rows : resultOfMultiplication){
            for(int val : rows){
              System.out.print( val + " ");
            }
            System.err.println();
        }

        int TransposeMatrixA[][] = transposeMatrix(matrixA);
        System.out.println("Transpose of matrix A");

        //intialize for each loop to display transpose of matrix
        for(int[] rows : TransposeMatrixA){
            for(int val : rows){
              System.out.print(val + " ");
            }
            System.out.println();
        }
       
         //Display the Determinant of matrix
        System.out.println("Determinant of Matrix A 2x2 :");
        System.out.println(determinant2x2(matrixA));

        System.out.println("Determinant of Matrix A in 3x3 matrix:");
        System.out.println(determinant3x3(matrixA));
    }

    
}
