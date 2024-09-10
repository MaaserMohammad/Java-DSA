package Maaser.basicjava;

import java.util.Scanner;

public class DifferenceOfSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= in.nextInt();
        int sum=0;
        int product=1;
        while(n>0){
            sum += n % 10;
            product *= n % 10;
            n /=10;
        }
        System.out.print("This is the difference of their Product and Sum of given number: ");
        System.out.println(product-sum);
    }
}
