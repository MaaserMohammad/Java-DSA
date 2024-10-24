package Maaser;

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
}
