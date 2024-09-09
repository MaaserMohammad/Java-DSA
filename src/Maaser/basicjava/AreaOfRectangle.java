package Maaser.basicjava;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Entered the value of the length: ");
        double l= in.nextDouble();
        System.out.print("Entered the value of the breadth: ");
        double b = in.nextDouble();
        double area=   b * l;
        System.out.println("Area of Rectangle is: " + area);
    }
}
