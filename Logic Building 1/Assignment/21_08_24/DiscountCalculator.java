public class DiscountCalculator {
    public static void main(String[] args) {
        double totalPurchase = 750.0;
        double discount = 0.0;
        if (totalPurchase >= 1000) {
            discount = 0.20; 
        }
		else if (totalPurchase >= 500) {
            discount = 0.10;
        }
		else {
            discount = 0.05;
        }
        double discountAmount = totalPurchase * discount;
        double finalAmount = totalPurchase - discountAmount;
        System.out.println("Total Purchase Amount: Rs." + totalPurchase);
        System.out.println("Discount Applied: " + (int)(discount * 100) + "%");
        System.out.println("Discount Amount: Rs." + discountAmount);
        System.out.println("Final Amount to Pay: Rs." + finalAmount);
    }
}

