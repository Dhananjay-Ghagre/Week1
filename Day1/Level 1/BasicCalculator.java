import java.util.Scanner;

class BasicCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        // Take the first number as input
        double number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");

        // Take the second number as input
        double number2 = sc.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Print the results
        System.out.println(
                "The addition, subtraction, multiplication, and division value of the numbers " +
                        number1 + " and " + number2 +
                        " is " + addition + ", " + subtraction + ", " + multiplication +
                        ", and " + division
        );

    }
}
