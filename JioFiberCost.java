public class JioFiberCost {
    public static void main(String[] args) {
        double baseCost = 699;
        double gstRate = 18;
        double gstAmount = (gstRate / 100) * baseCost;
        double finalCost = baseCost + gstAmount;

        System.out.println("JioFiber Silver Plan Final Cost (incl. GST): ₹" + finalCost);
    }
}
