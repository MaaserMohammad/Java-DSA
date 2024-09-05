package Maaser;

import java.util.Optional;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //for the first number
        System.out.println("enter the first number:");
        double num1 = input.nextDouble();

        //now put thr some number for the operator
        System.out.println("select the opertator (+,-,*,/):");
        char operator = input.next().charAt(0);

        //for the second number
        System.out.println("enter the second number:");
        double num2 = input.nextDouble();

        double result;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            //check for the divison by zero
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: can't didvide by zero");
                return;
            }
        } else {
            System.out.println("Error:envalid operator");
            return;
        }
        System.out.println("Result:" +result);
    }
}





