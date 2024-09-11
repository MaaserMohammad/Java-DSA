package Maaser;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = input.nextInt();

        // Initialize the first two terms
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            // Calculate the next term
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}
