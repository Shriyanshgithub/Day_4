import java.util.Scanner;

public class SimpleInterest{
          // method to calculating simple interest
	public static double simpleInterest(int principal, int rate, int time){
         double simpleInterest = (principal * rate * time) / 100; //formula for calculating simple Interest
	return simpleInterest; //return simple interest

	}
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
		
	System.out.println("Enter principal amount ");
	int principal = input.nextInt(); // taking principal amount as input
		
	System.out.println("Enter interest rate ");
        int rate = input.nextInt(); // taking interest rate as input
		
	System.out.println("Enter time ");
	int time = input.nextInt(); // taking time as input
		
	double interest = simpleInterest(principal, rate, time); //store simple interest in interest veriable
		
	System.out.print("The simple interest is "+ interest +" for principal "+ principal +", Rate of interest "+rate+ " and time "+ time  );

	input.close();
	}

}