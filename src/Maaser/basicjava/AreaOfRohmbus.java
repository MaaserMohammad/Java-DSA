package Maaser.basicjava;

import java.util.Scanner;

public class AreaOfRohmbus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of Diagonal 1: ");
        double d1= in.nextDouble();
        System.out.println("Enter the value of Diagonal 2: ");
        double d2= in.nextDouble();
        double area = 0.5 * d1 * d2;
        System.out.println("Area of rhombus is: " + area);
    }
}
