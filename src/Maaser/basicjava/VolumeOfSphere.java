package Maaser.basicjava;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Entered the value of radius: ");
        double r = in.nextDouble();
        double area=  (4.0/3.0)* Math.PI* Math.pow(r,3);
        System.out.print("Volume of the Sphere is:" +area);
    }
}
