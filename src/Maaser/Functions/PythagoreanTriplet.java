package Maaser.Functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    static boolean isTriplet(int ar[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];
                    if (x == y + z || y == x + z || z == x + y)
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        int ar[] = new int[size] ;
        System.out.print("Enter the array elements: ");
        int arrsize = ar.length;
        if (isTriplet(ar, arrsize) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}


