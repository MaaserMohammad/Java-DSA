package Maaser.Functions;

import java.util.Scanner;

public class StudentMarksheet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count;
        float totalMarks = 0, percentage,average;

        System.out.print("Enter Number of Subjects: ");
        count = in.nextInt();

        if (count <= 0) {
            System.out.println("Invalid number of subjects.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print("Enter Marks for Subject " + (i + 1) + ": ");
            int marks = in.nextInt();

        System.out.print("Enter Marks of " + count + " Subject: ");
        for (i = 0; i < count; i++) {
            totalMarks += in.nextInt();
        }

        System.out.println("Total Marks of the subject= " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;
    }
}
