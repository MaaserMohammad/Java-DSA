package Maaser.basicjava;

import java.util.Scanner;

public class Lcm_HcfCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What would you like to calculate?");
        System.out.println("1. LCM (Lowest Common Multiple)");
        System.out.println("2. HCF (Highest Common Factor)");
        System.out.print("Enter your choice (1 or 2): ");
        int choice= in.nextInt();

        if (choice != 1 && choice != 2) {
            System.out.println("Oops! Enter a valid number (1 or 2).");
        } else {
            System.out.print("Enter the first number: ");
            int num1 = in.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = in.nextInt();

        if (choice == 1 ) {
            int lcm = calculateLCM(num1, num2);
            System.out.println("LCM of " +num1 + " and " + num2+ " is: " +lcm);
        } else {
            int hcf = calculateHCF(num1, num2);
            System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
            }
        }
    }

    public static int calculateLCM(int a, int b) {
         return (a * b) / calculateHCF(a, b);
    }
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
