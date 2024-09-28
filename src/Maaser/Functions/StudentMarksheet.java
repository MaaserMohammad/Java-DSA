package Maaser.Functions;

import java.util.Scanner;

public class StudentMarksheet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count, i;
        float totalMarks = 0, percentage, average;


        System.out.println("Enter Number of Subject");
        count = in.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += in.nextInt();
        }

        System.out.println("Total MArks : " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;
    }
}
