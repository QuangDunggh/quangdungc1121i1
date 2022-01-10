package com.array;

import java.util.Scanner;

public class Find_max_value_inArrayOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(input.nextLine());
        int max = 20;
        int min = 1;
        double[][] array = new double[size][size];
        for (int i = 0; i < size; i++) {
            array[i] = new double[size];
            for (int j = 0; j < size; j++) {
                array[i][j] = (Math.random()*(max - min + 1) + min);
                System.out.println(array[i][j]);
            }
        }
        findMaxValue(array);
        System.out.println("Max item is: " + findMaxValue(array));

    }
    public static double findMaxValue(double[][] arr) {
        double maxItem = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (maxItem < arr[i][j]) {
                    maxItem = arr[i][j];
                }
            }
        }
        return maxItem;
    }
}
