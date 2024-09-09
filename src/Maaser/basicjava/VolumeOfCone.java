package Maaser.basicjava;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Entered the value of radius: ");
        double r= in.nextDouble();
        System.out.println("Entered the value of height: ");
        double h= in.nextDouble();
        double vol= Math.PI * r * r * h/3;
        System.out.println("Volume of Cone: " +vol);
    }
}
