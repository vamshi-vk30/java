package operators;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter an integer (num): ");
        int num = scanner.nextInt();

       
        String result = (num % 2 == 0) ? "Even" : "Odd";


        System.out.println("The number " + num + " is " + result + ".");

        scanner.close();
    }
}
