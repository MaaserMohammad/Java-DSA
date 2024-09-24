package Maaser.Functions;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        check(number);
    }

    public static int check(int number) {
        if (number % 2 == 0) {
            System.out.print("The given number " + number + " is even.");
        } else {
            System.out.print("The given number " + number + " is Odd.");
        }
        return number;
    }
}