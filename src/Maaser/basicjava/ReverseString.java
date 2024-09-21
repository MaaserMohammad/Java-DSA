package Maaser.basicjava;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String for the reverse: ");
        String var = in.nextLine();
        String rev = new StringBuilder(var).reverse().toString();  //creating fun for reverse the string

        System.out.println("Reversed String:  " + rev);
    }
}
