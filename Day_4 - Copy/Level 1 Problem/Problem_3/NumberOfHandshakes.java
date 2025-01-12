import java.util.Scanner;
 public class NumberOfHandshakes{
  //method to calculating total number of handshakes
   public static int calculateNoOfHandshakes(int number){
  int noOfHandshakes = (number*(number-1))/2; //calculate total number of handshakes
  return noOfHandshakes; // return noOfHandshakes
 
   }
   public static void main(String args[]){
   Scanner input = new Scanner(System.in);
 		
  System.out.println("Enter number of students ");
  int number = input.nextInt(); //taking number of students 
		
 
//store method( calculateNoOfHandshakes) result in handshakes
 
  int handshakes = calculateNoOfHandshakes(number);
  System.out.print("The total number handshakes  "+ handshakes  );
 
   input.close();
  }
 
}