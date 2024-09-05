package Maaser;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter your name");
        String name = input.next();
        System.out.println("have a good day buddy,"+ name + "!");
    }
}
