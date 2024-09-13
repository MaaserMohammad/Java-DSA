package Maaser.basicjava;

import java.util.Scanner;

public class AdditionOfTwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        double a= in.nextInt();
        System.out.print("Enter the second number: ");
        double b= in.nextInt();
        double sum= a+b;
        System.out.print("The sum of the given number is " +sum);

    }
}
