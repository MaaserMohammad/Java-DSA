package Maaser.basicjava;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the base value: ");
        int b= in.nextInt();
        System.out.println("Enter the height value:");
        int h= in.nextInt();
        double area= 0.5 * b * h;
        System.out.println("Area of triangle is: " +area);

    }
}
