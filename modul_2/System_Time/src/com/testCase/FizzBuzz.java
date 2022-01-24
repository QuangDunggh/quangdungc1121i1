package com.testCase;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        int number = 0;
        try {
            number = Integer.parseInt(input.nextLine());
        } catch (Exception o) {
            System.out.println("Đây không phải số nguyên");
        }
        checkFizzBuzz(number);
    }

    private static void checkFizzBuzz(int number) {
        if (number <= 0) {
            System.out.println("Phải là số nguyên lớn hơn 0");
        } else if (isFizzBuzz(number)) {
            System.out.println("FizzBuzz");
        } else if (isFizz(number)) {
            System.out.println("Fizz");
        } else if(isBuzz(number)) {
            System.out.println("Buzz");
        } else {
            System.out.println("No FizzBuzz");
        }
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean isFizzBuzz(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }
}
