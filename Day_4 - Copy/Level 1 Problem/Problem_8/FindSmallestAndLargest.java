import java.util.Scanner;

public class FindSmallestAndLargest{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
	
		//creating array of size to for storing smallest and largest number
		int[] smallestLargestArray = new int[2];
	
		// check if number is smallest
		if((number1 < number2) && (number1 < number3)){
			smallestLargestArray[0] = number1;
		}else if((number2 < number1) && (number2 < number3)){
			smallestLargestArray[0] = number2;
		}else{
			smallestLargestArray[0] = number3;
		}
		//check number is largest
		if((number1 > number2) && (number1 > number3)){
			smallestLargestArray[1] = number1;
		}else if((number2 < number1) && (number2 < number3)){
			smallestLargestArray[1] = number2;
		}else{
			smallestLargestArray[1] = number3;
		}
		
		return smallestLargestArray; //return array that store smallest and largest number
		
		
	
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number1 ");
		int numbe1 = input.nextInt(); //taking a number1 as input 
		
		System.out.println("Enter a number2 ");
		int number2 = input.nextInt(); //taking a number2 as input 
		
		System.out.println("Enter a number3 ");
		int number3 = input.nextInt(); //taking a number3 as input 
		
		//store result of mathod (smallestLargestArray) in resultsmallestLargestArray
		int[] resultsmallestLargestArray = findSmallestAndLargest(numbe1, number2, number3); 
		System.out.println("Smallest number is: "+ resultsmallestLargestArray[0] +" and Largest number is "+ resultsmallestLargestArray[1] );
		
		
		input.close();
		}
}