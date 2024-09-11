package Maaser.basicjava;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take integer inputs till the user enters 0 and print the sum of all numbers
        int sum= 0;
        int number;
        while (true){
            System.out.println("Enter a number(or 0 to stop): ");
            number = in.nextInt();
            if (number == 0) {
                break;
            }
            sum +=number;
        }
        System.out.println("The sum of all number is:" +sum);
    }
}
