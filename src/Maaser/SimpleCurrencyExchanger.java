package Maaser;

import java.util.Scanner;

public class SimpleCurrencyExchanger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //write code for rupees
        System.out.print("Indian Currency Amount:");
        double rupee = input.nextDouble();

        //exchange rates
        double usdExchangeRate = 83.9;
        double eurExchangeRate = 92.0;
        double gbpExchangeRate = 105.0;
        double yenExchangeRate = 12.0;

        //Calculating conversion
        double dollar = rupee / usdExchangeRate;
        double euro = rupee / eurExchangeRate;
        double pound = rupee / gbpExchangeRate;
        double yen = rupee / yenExchangeRate;

        System.out.println("USD value of currency: " + dollar);
        System.out.println("EUR value of currency: " + euro);
        System.out.println("GBP value of currency: " + pound);

        input.close();
    }
}





