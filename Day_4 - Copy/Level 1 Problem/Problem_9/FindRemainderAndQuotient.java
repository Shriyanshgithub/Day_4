import java.util.Scanner;

public class FindRemainderAndQuotient{
	
	public static int[] findRemainderAndQuotient(int number, int divisor){
	
	//creating array that store remainder and quotient
	 int[] remainderQuotientArray = new int[2];

	 //calculating quotient
	 int quotient = number/divisor;
         //calculating remainder
	 int remainder = number%divisor; 
	 
	 //storing quotient
	 remainderQuotientArray[0] = quotient; 
         //storing remainder
	 remainderQuotientArray[1] = remainder; 
	 
	 return remainderQuotientArray;
		
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int number = input.nextInt(); //taking a number as input 
		
		System.out.println("Enter a divisor ");
		int divisor = input.nextInt(); //taking a number as input
		
		//store result of method (findRemainderAndQuotient) in resultfindRemainderAndQuotient
		int[] resultfindRemainderAndQuotient = findRemainderAndQuotient(number, divisor); 
		System.out.print("the quotient of the "+number +" is "+ resultfindRemainderAndQuotient[0] + " and remainder of the "+ number + " is "+ resultfindRemainderAndQuotient[1]);
 
		input.close();
		}
 
}