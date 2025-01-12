import java.util.Scanner;

public class NumberOfchocolates{
	
	public static int[] findRemainderAndQuotient(int number, int divisor){
		//creating array
		int[] result = new int[2];
 
   		// calculating number of chocolates each student gets
		int numberOfChocolatesStudentGet = number/divisor;
		// calculating reaming chocolates 
		int remaingChocolate = number%divisor; 
		
		result[0] = numberOfChocolatesStudentGet; 
		result[1] = remaingChocolate; 
		
		return result;
		
	
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of chocolates ");
		int numberOfchocolates  = input.nextInt(); //taking a number of chocolates as input 
		
		System.out.println("Enter a number children ");
		int numberOfChildren  = input.nextInt(); //taking a number of children as input 
		
		//store result of method(findRemainderAndQuotient) in result
		int[] result = findRemainderAndQuotient(numberOfchocolates, numberOfChildren);
            System.out.println("Each child gets " + result[0] + " chocolates and Remaining chocolates: " + result[1]);
            
		
		input.close();
		}
 
}