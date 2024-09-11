package Maaser.basicjava;

import java.util.Scanner;

public class LargestNumberFromInput {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from all
        Scanner in = new Scanner(System.in);
        int largestnum = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter the integer(Enter 0 to Stop): ");
            int num = in.nextInt();
            if (num == 0) {
                break;
            }
            if (num > largestnum) {
                largestnum = num;
            }
        }
        if (largestnum == Integer.MIN_VALUE) {
            System.out.print("Enter valid number!");

        } else {
            System.out.println("The largest number is: " + largestnum);

        }
    }
}
