package com.array;

import java.util.Scanner;

public class Find_Item_smallest_inArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = Integer.parseInt(input.nextLine());
        int max = 30;
        int min = 10;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        System.out.println("Items in array are: ");
        for (int item: array) {
            System.out.println(item);
        }
        System.out.println("Min Item in Array is: " + findItemSmallest(array));

    }
    public static int findItemSmallest(int[] arr) {
        int size = arr.length;
        int minItem = arr[0];
        for (int i = 0; i < size; i++) {
            if (minItem >  arr[i]) {
                minItem = arr[i];
            }
        }
        return minItem;
    }
}
