package Maaser;

import java.util.Scanner;

public class SimpleCurrencyExchanger {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //write code for rupees
        System.out.print("Indian Currency Amount:");
        double rupee= input.nextDouble();

          //exchange rates
        double usdExchangeRate = 83.9;
        double eurExchangeRate = 92.0;
        double gbpExchangeRate = 105.0;

        //Calculating conversion
        double dollar = rupee / usdExchangeRate;
        double euro = rupee / eurExchangeRate;
        double pound = rupee / gbpExchangeRate;







