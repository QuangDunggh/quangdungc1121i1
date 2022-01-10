package com.array;

import java.lang.reflect.Array;

public class reverseArray {
    public static void main(String[] args) {
        int[] array = new int[7];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        array[5] = 5;
        array[6] = 6;


        for (int item: reverse(array)) {
            System.out.println(item);
        }

    }

    public static int[] reverse(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size/2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }

        return arr;
    }
}
