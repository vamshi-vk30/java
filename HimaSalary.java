public class HimaSalary {
    public static void main(String[] args) {
        double basicSalary = 58000;
        double da = (15.0 / 100) * basicSalary;
        double ta = (20.0 / 100) * basicSalary;
        double hra = (18.0 / 100) * basicSalary;

        double grossSalary = basicSalary + da + ta + hra;
        double tax = (25.0 / 100) * basicSalary;
        double netSalary = grossSalary - tax;

        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Tax: ₹" + tax);
        System.out.println("Net Salary after Tax: ₹" + netSalary);
    }
}
