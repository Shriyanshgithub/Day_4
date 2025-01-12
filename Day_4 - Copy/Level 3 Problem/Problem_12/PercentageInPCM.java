import java.util.*;
public class PercentageInPCM{
    
    //Function to generate the score
    public static double[][] GenerateScore(int numberOfStudent){
        double[][] score = new double[numberOfStudent][3];

        for (int i=0; i<numberOfStudent; i++){
            for (int j=0; j<3 ; j++){
                
                //Take random value fro math class
                score[i][j] = Math.round(((Math.random() * 90) +10) * 100)/100;
            }
        }
        return score;
    }
       // create the function to calculate the Score
    public static double[][] CalculateScore(double[][]score){
         double[][] result = new double[score.length][3];

        for (int i=0; i<score.length ; i++){
             double total = score[i][0] + score[i][1] + score[i][2];
             double percentage = (total/300)*100.0;
             double average = total/3.0;
             
            result[i][0] = total; // Total of each student mark in PCM
            result[i][1] = Math.round(percentage * 100.0) / 100.0; // round of to 2 decimal place
            result[i][2] = Math.round(average * 100.0) / 100.0; // round of to 2 decimal place
        }
       return result;
    }

    public static void DisplayResult(double [][] scorecard ,double[][]score, int numberOfStudent){
        System.out.println("Enter the number - " + numberOfStudent);
        System.out.println("Scorecard : ");

        System.out.println("Student" + "\t" + "Physics" + "\t" + "Chemistry" + "\t" + "Math" + "\t" + "Total" + "\t" + "Average" + "\t" + "Percentage" );
        System.out.println("-----------------------------------------------------------------");
        
        for(int i = 0; i<scorecard.length ; i++){
            
        System.out.println((i+1) + "\t" + score[i][0] + "\t" + score[i][1] + "\t" + score[i][2] + "\t" + scorecard[i][0] + "\t" + scorecard[i][1] + "\t" + scorecard[i][2]) ;
            
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter the number of student");
        int numberOfStudent = sc.nextInt();
        
        double[][] score = GenerateScore(numberOfStudent);

        double[][] totalPercentageAverage = CalculateScore(score);

        
        
        DisplayResult(totalPercentageAverage , score, numberOfStudent );
       
      sc.close();
    }
}