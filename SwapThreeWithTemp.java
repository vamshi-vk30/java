public class SwapThreeWithTemp {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        System.out.println("Before: a = " + a + ", b = " + b + ", c = " + c);

        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("After: a = " + a + ", b = " + b + ", c = " + c);
    }
}
