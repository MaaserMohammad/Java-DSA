package Maaser.Functions;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's find the Min and max of given 3 numbers!");

        System.out.print("Enter the first number: ");
        int firstNum = in.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = in.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNum = in.nextInt();

        int Max = Max(firstNum, secondNum, thirdNum);
        int Min = Min(firstNum, secondNum, thirdNum);

        System.out.println("The maximum of three numbers is " + Max);
        System.out.println("The minimum of three numbers is " + Min);
    }

    public static int Max(int  firstNum, int secondNum, int thirdNum) {
        int largest = firstNum;
        if (largest < secondNum) {
            largest = secondNum;
        }
        if (largest < thirdNum) {
            largest = thirdNum;
        }
        return largest;
    }

    public static int Min(int firstNum, int secondNum, int thirdNum) {
        int smallest = firstNum;
        if (secondNum < smallest) {
            smallest = secondNum;
        }
        if (thirdNum < smallest) {
            smallest = thirdNum;
        }
        return smallest;


    }
}