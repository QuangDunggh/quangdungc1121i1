package com.Loops;

import java.util.Scanner;
import java.lang.Math;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = Math.abs(scanner.nextInt());
        System.out.println("Enter b: ");
        int b = Math.abs(scanner.nextInt());
        int ucln = 0;
        if (a > b) {
            for (int i = 1; i <= (a / 2); i++) {
                if (a % i == 0 && b % i == 0) {
                    ucln = i;
                }
            }
        } else {
            for (int j = 1; j <= (b / 2); j++) {
                if (a % j == 0 && b % j == 0) {
                    ucln = j;
                }
            }
        }
        System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la " + ucln);

    }
}
