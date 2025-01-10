import java.util.Scanner;

class TotalPrice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//taking input for unitPrice
        int unitPrice = sc.nextInt();

//taking input for quantity
        int quantity = sc.nextInt();

//Total price
        int price = quantity * unitPrice;

        System.out.println("The total purchase price is INR  " + price + " if the quantity  " + quantity + " and unit price is INR " + unitPrice);

    }
}