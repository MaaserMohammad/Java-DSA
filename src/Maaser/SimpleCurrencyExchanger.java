package Maaser;

import java.util.Scanner;

public class SimpleCurrencyExchanger {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //write code for rupees
        System.out.print("Indian Currency Amount:");
        double rupee= input.nextDouble();

        //exchange
        double exchangerate= 83.9;
        double dollar= rupee/exchangerate;
        System.out.println("USD value of currency:" + dollar);
    }
}




