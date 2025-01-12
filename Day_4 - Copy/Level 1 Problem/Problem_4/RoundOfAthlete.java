import java.util.Scanner;
 
	public class RoundOfAthlete{
              	public static int NumberOfRound(double side1 , double side2 , double side3 , int distance){
			double perimeter = side1 + side2 + side3;
                        distance = distance * 1000;
 
			int rounds = (int)distance/(int)perimeter;
			return rounds;
		}
 
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of side1");
			double side1 = sc.nextDouble();
 
			System.out.println("Enter the value of side2");
 			double side2 = sc.nextDouble();
 
			System.out.println("Enter the value of side3");
			double side3 = sc.nextDouble();
 
                        //give distance in meter i.e convert km to meter;
			int distance = sc.nextInt();
 
		int round = NumberOfRound(side1 , side2, side3 , distance);
      		System.out.println("The number of round athlete run " + round);
	}
}
 