import java.util.Scanner;

public class PointOperations {

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate the slope and y-intercept of the line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1); // Calculate slope (m)
        double yIntercept = y1 - (slope * x1); // Calculate y-intercept (b)
        return new double[] { slope, yIntercept }; // Return slope and y-intercept as an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate and display the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the points: " + distance);

        // Calculate and display the line equation
        
            double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
            double slope = lineEquation[0];
            double yIntercept = lineEquation[1];
            System.out.println("Equation of the line: y = " + slope + "x + " + yIntercept);
        

        scanner.close();
    }
}
