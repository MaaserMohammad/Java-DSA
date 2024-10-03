package Maaser.Functions;

import java.util.Scanner;
public class CheckPalindrome {
    public static boolean checkPalindrome(int num) {
        int reverse = 0;
        int temp = num;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == num);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want : ");
        int num = in.nextInt();
        if (checkPalindrome(num)) {
            System.out.println("Yes! it is a palindrome number.");
        } else {
            System.out.println("No! it is not palindrome number.");
        }
    }
}



