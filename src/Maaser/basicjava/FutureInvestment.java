package Maaser.basicjava;
import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter the Principal Amount (initial Investment): ");
        double principal = in.nextDouble();

        System.out.print("Enter the Annual rate (in percentage): ");
        double intrestrate = in.nextDouble() / 100;

        System.out.print("Enter the number of the years: ");
        int years = in.nextInt();

        double futurevalue= principal * Math.pow((1+intrestrate),years);
        System.out.printf("Future investment of the given value:%.2f\n", futurevalue);
    }
}
