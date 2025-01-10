import java.util.Scanner;

class KilometerToMile {

    public static void main(String[] args) {

//Value of one mile in km
        double oneMile = 1.6;

        Scanner sc = new Scanner(System.in);

//taking imput of distance in km
        double km = sc.nextDouble();

//Converting distance from kilometers to miles
        double distanceInMiles = km * oneMile;


// We are printing distance in miles
        System.out.println(" The total miles is " + distanceInMiles + " mile for the given " + km + " km");

    }

}
