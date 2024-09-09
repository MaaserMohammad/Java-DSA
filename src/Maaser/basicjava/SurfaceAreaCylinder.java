package Maaser.basicjava;

import java.util.Scanner;

public class SurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entered the value of radius: ");
        double r= in.nextDouble();
        System.out.print("Entered the value of height: ");
        double h= in.nextDouble();
        double Sarea= (Math.PI*2*r*h) + (2*Math.PI*r*r);
        System.out.print("Surface area of the Cylinder is:" +Sarea);


    }
}
