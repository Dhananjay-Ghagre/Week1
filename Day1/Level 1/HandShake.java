import java.util.Scanner;

class HandShake {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//Taking input for number of Students
        int numberOfStudents = sc.nextInt();

//Number of possible handshakes
        int possiblehandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

//Printing possible number of handshakes
        System.out.println(possiblehandshakes);

    }
}