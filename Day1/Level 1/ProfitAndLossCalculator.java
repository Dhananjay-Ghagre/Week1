class ProfitAndLossCalculator {

    public static void main(String[] args) {

        // Cost price in INR
        int costPrice = 129;

        // Selling price in INR
        int sellingPrice = 191;

        // Calculate profit
        int profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercentage = (profit / (double) costPrice) * 100;

        // Print the results in a single print statement with multiline text
        System.out.println(
                "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                        "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%"
        );
    }
}
