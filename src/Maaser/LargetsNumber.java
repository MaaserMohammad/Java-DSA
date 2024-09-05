package Maaser;

import java.util.Scanner;

public class LargetsNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter first number:");
        double num1= input.nextDouble();
        System.out.println("enter second number:");
        double num2= input.nextDouble();
        double largest=(num1>num2)? num1:num2;
        System.out.println("the largest number is" +largest);
    }
}
