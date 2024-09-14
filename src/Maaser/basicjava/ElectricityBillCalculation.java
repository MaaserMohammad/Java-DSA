package Maaser.basicjava;

import java.util.Scanner;

public class ElectricityBillCalculation {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Enter the power/units  consumption(Watts): ");
        double power = in.nextDouble();

        System.out.print("Enter the time period of thr electricity: ");
        double time= in.nextDouble();

        double units= power * time;
        System.out.println("Total units consumed: " +units+ " kWh");

        double bill = 0;

        if(units <= 100){
            bill = units * 5;
        } else if (units <= 200) {
            bill = units * 5 + (units - 100) * 7;
        } else {
            bill = 100 * 5 + 100 * 7 + (units - 200) * 8;
        }
        System.out.println("The total electricity bill is " +bill);


    }
}
