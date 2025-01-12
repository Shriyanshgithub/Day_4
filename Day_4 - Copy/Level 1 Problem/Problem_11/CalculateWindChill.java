import java.util.Scanner;
 
public class CalculateWindChill{
	
 	public static double calculateWindChill(double temperature, double windSpeed){
 		//calculating windChill using formula
 		double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed,0.16); 
		
	 	return windChill; 
	
	 }
 	public static void main(String args[]){
 		Scanner input = new Scanner(System.in);
	 	
                  //taking a temperature as input 
		System.out.println("Enter a temperature ");
	 	
		System.out.println("Enter a windSpeed ");
                  //taking a windSpeed as input 
	 	double windSpeed = input.nextInt(); 
		
	 	double resultCalculateWindChill = calculateWindChill(temperature, windSpeed);
	 	System.out.println("windChill is: "+ resultCalculateWindChill);

	 	input.close();
		}
 
}