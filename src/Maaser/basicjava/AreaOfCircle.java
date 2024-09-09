package Maaser.basicjava;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("enter the radius of circle: ");
        double r= in.nextInt();
        double area= Math.PI * r * r;
        System.out.print("print the area of circle: " + area);


    }
}
