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

        int choice = in.nextInt();
        double input, result;

        switch (choice) {
            case 1:
                System.out.print("Enter distance in kilometers: ");
                input = in.nextDouble();
                result = kilometersToMiles(input);
                System.out.println(input + " kilometers is " + result + " miles.");
                break;

            case 2:
                System.out.print("Enter temperature in Celsius: ");
                input = scanner.nextDouble();
                result = celsiusToFahrenheit(input);
                System.out.println(input + " Celsius is " + result + " Fahrenheit.");
                break;
            case 3:
                System.out.print("Enter weight in grams: ");
                input = scanner.nextDouble();
                result = gramsToPounds(input);
                System.out.println(input + " grams is " + result + " pounds.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        in.close();
    }
}

