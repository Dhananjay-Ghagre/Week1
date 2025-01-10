import java.util.Scanner;

class SquareSideCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");

        // Read the perimeter as an integer
        int perimeter = sc.nextInt();

        // Calculate the side of the square
        int side = perimeter / 4;  // Side = Perimeter / 4

        // Display the result
        System.out.println(
                "The length of the side is " + side +
                        " whose perimeter is " + perimeter
        );

    }
}
