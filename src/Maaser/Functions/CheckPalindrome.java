package Maaser.Functions;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean checkPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        if (checkPalindrome(n)) {
            System.out.println("Yes! it is a palindrome number.");
        } else {
            System.out.println("No! it is not palindrome number.");
        }
    }
}



