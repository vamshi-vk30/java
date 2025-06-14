public class SwapFourWithoutTemp {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;

        System.out.println("Before: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

        a = a + b + c + d;
        b = a - (b + c + d);
        c = a - (b + c + d);
        d = a - (b + c + d);
        a = a - (b + c + d);

        System.out.println("After: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }
}
