import java.util.Scanner;

public class CheckSeason{
	//method to check is season sprint or not
	public static boolean checkIsSprintOrNot(int month, int date){
		if((month == 3 && date >= 20) || month == 4 || month == 5 || (month == 6 && date <= 20)){
			return true; // return true if season is sprint check according to month and date
		}else{
			return false; // return false if season is not sprint check according to month and date
		}
		
	
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a month ");
		int month = input.nextInt(); //taking month as input 
		
		System.out.println("Enter a date ");
		int date = input.nextInt(); //taking date as input
		
		
		
		//store method( checkIsSprintOrNot) result in resultCheckIsSprintOrNot
		boolean resultCheckIsSprintOrNot = checkIsSprintOrNot(month, date);
		
		if(resultCheckIsSprintOrNot == true){
			System.out.print(" Its a Spring Season");
		}else{
			System.out.print(" Not a Spring Season");
		}
		
		input.close();
		}
}