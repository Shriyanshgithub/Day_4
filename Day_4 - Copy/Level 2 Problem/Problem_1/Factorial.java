import java.util.*;
public class Factorial{
    public static int[] CountFactor(int number){
        int[] factorOfNumber = new int[number];
        int index = 0;
        for(int i=1; i<=number ; i++){
            if(number % i == 0){
                factorOfNumber[index++] = i;
            }
        }
        return factorOfNumber;
    }

    public static int SumOfFactor(int[] arr){
        int sum =0 ;
        for(int i : arr){
           sum += i;
        }
        return sum;
    }

    public static int SquareSumOfFactor(int[] arr){
        int squareOfFactor = 0;
        for(int i : arr){
            squareOfFactor += Math.pow(i, 2); 
        }
        return squareOfFactor;
    }

    public static int ProductOfFactor(int[] arr){
        int product = 1;
        for(int i : arr){
            product = product * i;
        }
        return product;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        int[] arr = CountFactor(number);
        int sum = SumOfFactor(arr);
        System.out.println("Sum of all factor : " + sum);

        int squreOfFactor = SquareSumOfFactor(arr);
        System.out.println("Sum of square all factor : " + squreOfFactor);

        int productOfFactor = ProductOfFactor(arr);
        System.out.println("Product of all factor : " + productOfFactor);
    }
}