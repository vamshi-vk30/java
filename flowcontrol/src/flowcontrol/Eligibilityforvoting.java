package flowcontrol;

import java.util.Scanner;

public class Eligibilityforvoting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

       
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        scanner.close();
    }
}

