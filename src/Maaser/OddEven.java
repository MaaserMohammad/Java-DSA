package Maaser;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter number");
        int num1= input.nextInt();
        if(num1%2 == 0){
            System.out.println("even");}
        else{
            System.out.println("odd");
        }
    }

}
