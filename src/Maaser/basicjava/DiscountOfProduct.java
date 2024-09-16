package Maaser.basicjava;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the original price of the pf the product: ");
        double originalprice = in.nextDouble();

        System.out.print("Enter the Discount percentage of the product: ");
        double discountPercentage  = in.nextDouble();

        double discount = (discountPercentage/100) * originalprice;

        double finalprice= originalprice - discount;
        System.out.printf("Discount on the product: ₹%.2f\n" ,discount);
        System.out.printf("Final price after discount: ₹%.2f\n" ,finalprice);

    }
}
