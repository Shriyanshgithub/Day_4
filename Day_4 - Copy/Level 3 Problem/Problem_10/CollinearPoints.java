import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using the slope formula
    public static boolean areCollinearUsingSlopes(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes of AB, BC, and AC
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Check if slopes are equal
        if(slopeAB == slopeBC && slopeBC == slopeAC){
            return true;
        }
        return false;
    }

    // Method to check collinearity using the area of triangle formula
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by the three points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // If the area is 0, the points are collinear
        if(area == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the coordinates of the three points
        System.out.print("Enter x1, y1 for point A: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2, y2 for point B: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter x3, y3 for point C: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Check collinearity using slope formula
        boolean collinearSlopes = areCollinearUsingSlopes(x1, y1, x2, y2, x3, y3);

        // Check collinearity using area formula
        boolean collinearArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        // Display the results
        System.out.println("\nUsing slope formula: The points are " + (collinearSlopes ? "collinear." : "not collinear."));
        System.out.println("Using area formula: The points are " + (collinearArea ? "collinear." : "not collinear."));

        scanner.close();
    }
}
