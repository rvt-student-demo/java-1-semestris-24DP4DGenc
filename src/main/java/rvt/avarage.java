package rvt;

import java.util.Scanner;

public class avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = scanner.nextInt();

        System.out.println("Give the second number:");
        int second = scanner.nextInt();

        double average = (first + second) / 2.0;

        System.out.println("The average is " + average);
    }
}

