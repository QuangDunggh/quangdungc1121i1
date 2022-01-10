package com.array;

import java.util.Scanner;

public class Delete_index_inArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item: array) {
            System.out.println(item);
        }
        deleteItem(array);
        for (int item: array) {
            System.out.println(item);
        }
    }
    public  static int[] deleteItem(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = Integer.parseInt(input.nextLine());
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (number == arr[i]) {
                System.out.println("Your number is in the Array and have index " + i);
                System.out.print("Enter the number you want change: ");
                int num = Integer.parseInt(input.nextLine());
                arr[i] = num;
                break;
            }
        }
        return arr;
    }
}
