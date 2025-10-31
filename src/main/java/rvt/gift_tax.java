package rvt;

import java.util.Scanner;

public class gift_tax {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.print("Value of the gift? ");
        double value = input.nextDouble();
        input.close();
        
        double tax = 0;

        if (value < 5000) {
            tax = 0;
        } else if (value <= 25000) {
            tax = 100 + (value - 5000) * 0.08;
        } else if (value <= 55000) {
            tax = 1700 + (value - 25000) * 0.10;
        } else if (value <= 200000) {
            tax = 4700 + (value - 55000) * 0.12;
        } else if (value <= 1000000) {
            tax = 22100 + (value - 200000) * 0.15;
        } else {
            tax = 142100 + (value - 1000000) * 0.17;
        }

        if (tax == 0) {
            System.out.println("No tax!");
        } else {
            System.out.printf("Amount of tax: %.2f euros%n", tax);
        }
    }
}

