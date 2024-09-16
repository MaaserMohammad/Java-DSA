package Maaser.basicjava;

import java.util.Scanner;

public class DistanceOfPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of first value of x coordinate:");
        double x1= in.nextDouble();
        System.out.print("Enter the value of second value of x coordinate:");
        double x2= in.nextDouble();

        System.out.print("Enter the value of first value of y coordinate:");
        double y1= in.nextDouble();
        System.out.print("Enter the value of second value of y coordinate:");
        double y2= in.nextDouble();

        double distance= Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2- y1),2));
        System.out.printf("The distance between of two points is: %.2f\n" ,distance);
    }
}
