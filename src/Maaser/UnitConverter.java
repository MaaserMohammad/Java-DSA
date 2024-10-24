package Maaser;

import java.util.Scanner;

public class UnitConverter {
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double gramsToPounds(double grams) {
        return grams * 0.00220462;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose conversion type: ");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Grams to Pounds");
}
