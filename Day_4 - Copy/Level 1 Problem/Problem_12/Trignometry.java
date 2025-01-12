import java.util.*;
public class Trignometry{
  public double[] calculateTrigonometricFunctions(double angle){
   double angelInRadian = Math.toRadians(angle);
   double sineConvert = Math.sin(angelInRadian);
   double cosConvert = Math.cos(angelInRadian);
   double tanConvert = Math.tan(angelInRadian);
   
   return new double[]{sineConvert,cosConvert,tanConvert};
   
  }
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Angele in degree");
   double angle = sc.nextDouble();
   double[] trigno = new double[3];
   
   Trignometry obj = new Trignometry();
   trigno = obj.calculateTrigonometricFunctions(angle);
   
   for(int i =0 ; i<trigno.length; i++){
     System.out.println(trigno[i]);
	 }
	}
}
   
   