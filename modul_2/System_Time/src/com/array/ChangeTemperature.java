package com.array;

import java.util.Scanner;

public class ChangeTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        int number = -1;
        do {
            System.out.print("Enter your choice: ");
            number = Integer.parseInt(input.nextLine());
            switch (number) {
                case 1:
                    System.out.print("Enter the Fahrenheit: ");
                    double theF = Double.parseDouble(input.nextLine());
                    double result = (5.0 /  9.0) * (theF - 32);
                    System.out.println("The Celsius is equal: " + result);
                    break;
                case 2:
                    System.out.print("2. Enter the Celsius: ");
                    double theC = Double.parseDouble(input.nextLine());
                    double result_1 = (9.0 / 5.0) * (theC + 32);
                    System.out.println("The Celsius is equal: " + result_1);
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        } while (number != 0);

    }
}
