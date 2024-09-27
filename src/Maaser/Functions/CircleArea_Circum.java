package Maaser.Functions;

import java.awt.*;
import java.util.Scanner;

public class CircleArea_Circum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");

        double radius = in.nextDouble();
        //Area = PI*radius*radius
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
        //Circumference = 2*PI*radius
        double circumference = Math.PI * 2 * radius;
        System.out.printf("The circumference of the circle is: %.4f\n", circumference ,area);
    }
}

