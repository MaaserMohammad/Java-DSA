package Maaser.basicjava;

import java.util.Scanner;

public class CalculatorMini {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.print("Let's calculate some sums! Enter numbers one by one (enter 0 to finish):");
        while (true) {
            int number = in.nextInt();
            if (number == 0) {
                break;
            }
            if (number < 0) {
                sumNegative += number;
            } else {
                if (number % 2 == 0) {
                    sumPositiveEven += number;
                } else {
                    sumPositiveOdd += number;
                }
            }
        }
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
    }
}

