public class DominosBill {
    public static void main(String[] args) {
        double pizzaPrice = 399;
        int quantity = 2;
        double discountRate = 20;

        double totalBill = pizzaPrice * quantity;
        double discountAmount = (discountRate / 100) * totalBill;
        double finalAmount = totalBill - discountAmount;

        System.out.println("Final Bill after 20% discount: ₹" + finalAmount);
    }
}
