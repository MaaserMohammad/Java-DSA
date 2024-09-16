package Maaser.basicjava;

import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to calculate the average: ");
        int num= in.nextInt();
        double sum =0;
        for (int i=1; i <= num; i++){
            System.out.print("Enter number " +i+ ": ");
            double number= in.nextDouble();
            sum += number;
        }
        double avg = sum/ num;
        System.out.println("The average of the " +num+ " number is: " +avg);

    }
}
