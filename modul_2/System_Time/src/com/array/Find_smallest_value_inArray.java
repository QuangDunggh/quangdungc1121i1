package com.array;

import java.util.Scanner;

public class Find_smallest_value_inArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your size array: ");
        int size = Integer.parseInt(input.nextLine());
        int max = 30;
        int min = 1;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random()*(max - min + 1) + min);
        }
        System.out.println("Item in array: ");
        for (int item: array) {
            System.out.println(item);
        }
        System.out.println("The min value in array is: " + findSmallestValue(array));
    }
    public static int findSmallestValue(int[] arr) {
        int size = arr.length;
        int minValue = arr[0];
        for(int i = 0; i < size; i++) {
            if(minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
