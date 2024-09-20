package Maaser.basicjava;

import java.util.Scanner;

public class CgpaCalculation {

    //Calculate CGPA in Java Program
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Subject: ");
        int numSubject= in.nextInt();

        double totalCGPA= 0;
        for(int i = 1; i <= numSubject; i++){
            System.out.print("Enter the markes/grade of the Subject " +i + ": ");
            double grade= in.nextDouble();
            totalCGPA = totalCGPA + grade;
        }
        double cgpa= totalCGPA / numSubject;
        System.out.printf("Your CGPA is: %.2f\n", cgpa);
    }
}
