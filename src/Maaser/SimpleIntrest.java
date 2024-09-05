package Maaser;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //for time
        System.out.print("enter the time");
        double time= input.nextDouble();
        //for  principal
        System.out.print("enter the principal");
        double principal= input.nextDouble();
        //fro rate
        System.out.print("enter the rate");
        double rate= input.nextDouble();

       double simpleintrest= (time * principal * rate)/100;
        System.out.println("Total simple  intrest=" + simpleintrest);
    }
}
