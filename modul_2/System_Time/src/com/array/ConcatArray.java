package com.array;

import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size_1: ");
        int size1 = Integer.parseInt(input.nextLine());
        System.out.print("Enter size_2: ");
        int size2 = Integer.parseInt(input.nextLine());
        int max = 50;
        int min = 15;
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        System.out.println("array 1: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        for (int item : arr1) {
            System.out.println(item);
        }
        System.out.println("array 2: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        for (int item : arr2) {
            System.out.println(item);
        }
        System.out.println("new array: ");
        for (int item : concat(arr1, arr2)) {
            System.out.println(item);
        }
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int size = arr1.length + arr2.length;
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] arr = new int[size];
        for (int i = 0; i < size1; i++) {
            arr[i] = arr1[i];
        }
        for (int i = arr1.length, j = 0; i < size; i++, j++) {
            arr[i] = arr2[j];
        }
        return arr;
    }
}
