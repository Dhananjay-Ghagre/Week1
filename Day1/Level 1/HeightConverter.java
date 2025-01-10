import java.util.Scanner;

class HeightConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");

        // Take height input in cm
        double heightCm = sc.nextDouble();

        // Conversion factors
        double cmToInches = 2.54;  // 1 inch = 2.54 cm
        double inchesToFeet = 12;  // 1 foot = 12 inches

        // Convert height from cm to inches
        double totalInches = heightCm / cmToInches;

        // Convert total inches to feet and remaining inches
        int feet = (int) (totalInches / inchesToFeet);  // Get the whole number of feet
        double inches = totalInches % inchesToFeet;  // Get the remaining inches

        // Print the results
        System.out.println(
                "Your Height in cm is " + heightCm +
                        " while in feet is " + feet +
                        " and inches is " + inches
        );


    }
}
