public class SwapFourWithTemp {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;

        System.out.println("Before: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

        int temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;

        System.out.println("After: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }
}
