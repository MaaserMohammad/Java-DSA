package Maaser;

import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("The number of term must be Positive.");
            return;
        }
        int a = 0, b = 1;
        int sum = a;
        System.out.println("Fibonacci series up to " + n + " terms: ");
        System.out.print(a + " ");
        if (n > 1) {
            System.out.println(b + " ");
            sum = sum + b;
        }
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.println(next + " ");
            sum = sum + next;
            a = b;
            b = next;
        }
        System.out.println();
        System.out.println("The sum of Fibonacci series up to "  + n +  " terms "  +  sum);
    }
}