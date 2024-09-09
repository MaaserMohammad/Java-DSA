package Maaser.basicjava;

import java.util.Scanner;

public class AreaOfEquilateraltri {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Entered the value of th side: ");
        double side= in.nextDouble();
        double area= (Math.sqrt(3))/4 * side * side;
        System.out.println("Area of Equilateral triangle is: " +area);
    }
}
