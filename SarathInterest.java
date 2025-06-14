public class SarathInterest {
    public static void main(String[] args) {
        double principal = 500000;
        double rate = 6.8;
        int time = 5;

        double interestAmount = (principal * rate * time) / 100;
        double finalAmount = principal + interestAmount;

        System.out.println("Interest Amount: ₹" + interestAmount);
        System.out.println("Final Amount after 5 years: ₹" + finalAmount);
    }
}
