package Maaser;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = input.nextInt();

        // Initialize the first two terms
        int term1 = 0;
        int term2 = 1;

        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(term1 + " ");

            // Calculate the next term
            int nextTerm = term1 + term2;
            term1 = term2;
            term2 = nextTerm;
        }

        input.close();
    }
}
