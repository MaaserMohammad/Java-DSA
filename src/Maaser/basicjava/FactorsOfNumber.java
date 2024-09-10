package Maaser.basicjava;

import java.util.Scanner;

public class FactorsOfNumber {
        public static void main(String[] args) {
            Scanner  in = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int number = in.nextInt();
            System.out.println("Factors of " + number + ":");
             for (int i = 1;i<=number;i++){
                 if (number % i == 0){
                 System.out.println(i+ " ");
                }
            }
        }
    }


