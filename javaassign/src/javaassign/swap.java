package javaassign;

public class swap {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
