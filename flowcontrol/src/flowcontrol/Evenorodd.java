package flowcontrol;

import java.util.Scanner;

public class Evenorodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

       
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }

        scanner.close();
    }
}
