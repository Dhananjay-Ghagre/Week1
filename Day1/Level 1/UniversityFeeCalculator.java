class UniversityFeeCalculator {

    public static void main(String[] args) {

        // Course fee in INR
        int fee = 125000;

        // Discount percentage
        int discountPercent = 10;

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100.0;

        // Calculate the final fee after discount
        double finalFee = fee - discount;

        // Print the results in a single statement
        System.out.println(
                "The discount amount is INR " + discount +
                        " and the final discounted fee is INR " + finalFee
        );
    }
}
