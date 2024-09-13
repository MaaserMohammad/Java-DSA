package Maaser.basicjava;

import java.util.Arrays;
import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number that factorial you want: ");
        int num= in.nextInt();
        if (num < 0){
            System.out.print("Factorial of negative number can't define.");
        } else {
            int factorial= 1;
            for (int i = 1; i <= num; i++  ){
                factorial = factorial * i;
            }
            System.out.print("Factorial of " +num + " is " +factorial);

        }


    }

}
