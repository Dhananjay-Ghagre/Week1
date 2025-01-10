import java.util.Scanner;

class TriangleAreaCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in inches: ");

        // Base in inches
        double baseInches = sc.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        // Height in inches
        double heightInches = sc.nextDouble();

        // Calculate the area of the triangle in square inches
        double areaInches = 0.5 * baseInches * heightInches;

        // Conversion factor: 1 square inch = 6.4516 square centimeters
        double areaCm = areaInches * 6.4516;

        // Print the results
        System.out.println(
                "The base of the triangle is " + baseInches + " inches, " +
                        "the height is " + heightInches + " inches, " +
                        "the area in square inches is " + areaInches + ", " +
                        "and the area in square centimeters is " + areaCm
        );

    }
}
