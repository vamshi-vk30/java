public class VikramTax {
    public static void main(String[] args) {
        double salary = 85000;
        double taxRate = 20;

        double taxAmount = (taxRate / 100) * salary;
        double netSalary = salary - taxAmount;

        System.out.println("Tax Amount: ₹" + taxAmount);
        System.out.println("Net Salary after Tax: ₹" + netSalary);
    }
}
