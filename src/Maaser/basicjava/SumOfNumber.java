package Maaser.basicjava;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
