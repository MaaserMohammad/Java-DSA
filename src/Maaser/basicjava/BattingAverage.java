package Maaser.basicjava;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total run: ");
        int totalrun= in.nextInt();
        System.out.print("Enter the number of the innings: ");
        int innings = in.nextInt();

        double battingAvg= totalrun / innings ;
        System.out.println("The Avg of the batting is " +battingAvg);
    }
}
