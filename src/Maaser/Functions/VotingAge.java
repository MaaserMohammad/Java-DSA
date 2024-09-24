package Maaser.Functions;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please! Enter your age for the verification: ");
        int age = in.nextInt();
        age(age);

    }
    public static int age(int a){
        if (a >= 18) {
            System.out.println("Congratulation! you are eligible for the vote.");
        }
        else {
            System.out.println("Sorry! you are not eligible for the vote.");
        }
        return a;
    }
}
