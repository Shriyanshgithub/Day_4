import java.util.*;
public class EmployeeBonus{

    public static int[][] GenerateSalaryAndYear(int numberOfEmployee){
        int[][] yearAndSalary = new int[numberOfEmployee][2];
        for(int i=0 ; i< numberOfEmployee ; i++){
            yearAndSalary[i][0] = (int)((Math.random() * 10)+1);
            yearAndSalary[i][1] = (int)(Math.random() * 100000);
        }
        return yearAndSalary;
    }
        
    
    
    //Function to calculate new salary and bonus amount
    public static double[][] CalculateBonusAndNewSalary(int[][] salaryAndYear){
        double[][] bonusAndNewSalary = new double[salaryAndYear.length][2];
           int i =0;
        while(i<salaryAndYear.length){
            
                if(salaryAndYear[i][0] >= 5){
                  bonusAndNewSalary[i][0] = (salaryAndYear[i][1] * 5)/100.0;
                  bonusAndNewSalary[i][1] = salaryAndYear[i][1] + bonusAndNewSalary[i][0];
                }
                else{
                    bonusAndNewSalary[i][0] = (salaryAndYear[i][1] * 2)/100.0;
                  bonusAndNewSalary[i][1] = salaryAndYear[i][1] + bonusAndNewSalary[i][0];
                }
                i++;
        }
        return bonusAndNewSalary;
    }
   
    public static void calculateAndDisplayTotal(int[][] salaryAndYear, double[][] newBonusAndSalary ) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("Employee Salary and Bonus Information:");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Employee\tOld Salary\tYears of Service\tBonus\tNew Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < salaryAndYear.length; i++) {
            int oldSalary = salaryAndYear[i][1];
            double bonus = newBonusAndSalary[i][0];
            double newSalary = newBonusAndSalary[i][1];
            int yearsOfService = salaryAndYear[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("Employee %d\t%d\t\t%d\t\t\t%.2f\t%.2f\n", (i + 1), oldSalary, yearsOfService, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employee");
        int numberOfEmployee = sc.nextInt();

        int[][] salaryAndYear = GenerateSalaryAndYear(numberOfEmployee);
        
        double[][] newBonusAndSalary = CalculateBonusAndNewSalary(salaryAndYear);
       
        calculateAndDisplayTotal(salaryAndYear , newBonusAndSalary);

    }
}