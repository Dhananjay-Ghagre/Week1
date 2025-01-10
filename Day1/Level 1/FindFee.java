import java.util.Scanner;

class FindFee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//Taking input for fee
        int fee = sc.nextInt();

//Taking input of discountPercent
        int discountPercent = sc.nextInt();

//Calculating discount
        int discount = (fee * discountPercent) / 100;

//Fees after discount
        int discountedFees = fee - discount;

//Printing discounted fees
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR  " + discountedFees);

    }
}


