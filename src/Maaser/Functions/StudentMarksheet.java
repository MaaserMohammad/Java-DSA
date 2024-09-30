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

            while (marks < 0 || marks > 100) {
                System.out.print("Invalid marks. Please enter marks between 0 and 100 for Subject " + (i + 1) + ": ");
                marks = in.nextInt();
            }

            totalMarks += marks;
        }

        percentage = (totalMarks / (count * 100)) * 100;
        average = totalMarks / count;

        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.printf("Average Marks: %.2f\n", average);

        if (percentage < 30) {
            System.out.println("Result: Fail");
        } else if (percentage < 70) {
            System.out.println("Result: Pass");
        } else if (percentage < 80) {
            System.out.println("Result: First Division");
        } else {
            System.out.println("Result: Distinction");
        }

    }
}
