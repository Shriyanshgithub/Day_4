import java.util.Scanner;

public class NNaturalNumber{
	//method to check is season sprint or not
	public static int sumOfNNaturalNo(int number){
	int sum =0; //initialising sum variable
		for(int i=1; i<=number; i++){
			sum += i; //adding sum of natural number
		} 
		return sum;// return sum of natural number 
		
	
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = input.nextInt(); //taking a number as input 
		
		int resultSumOfNNaturalNo = sumOfNNaturalNo(number);//storing result method(sumOfNNaturalNo) in resultSumOfNNaturalNo 
		System.out.print("Sum of "+number +" natural number is "+resultSumOfNNaturalNo);
		input.close();
		}
}