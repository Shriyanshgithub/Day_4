import java.util.Scanner;

public class CheckNumber{
     	//method to calculating total number of handshakes
	public static int checkNumber(int number){
	
		if(number <0){
			return -1; //return -1 if number is negative
		}else if(number >0 ){
			return 1; // return 1 if number is positive
		}else{
			return 0; // return 0 if number is zero
		}
	
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int number = input.nextInt(); //taking a number as input 
		
		
		
		//store method( checkNumber) result in resultCheckNumber
		int resultCheckNumber = checkNumber(number);
		System.out.print(resultCheckNumber);
		input.close();
		}
 
}