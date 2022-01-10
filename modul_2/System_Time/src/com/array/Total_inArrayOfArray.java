package com.array;

import java.util.Scanner;

public class Total_inArrayOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size in array: ");
        int size = Integer.parseInt(input.nextLine());
        int max = 30;
        int min = 10;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i] = new int[size];
            System.out.println(array[i]);
            for (int j = 0; j < size; j++) {
                array[i][j] = (int) (Math.random()*(max - min + 1) + min);
                System.out.println(array[i][j]);
            }
        }
        System.out.println("Tong la: ");
        System.out.println(total(array));
    }
    public static int total(int[][] arr) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so dong ban muon tinh tong: ");
        int index = Integer.parseInt(input.nextLine());
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            total += arr[index][i];
        }
        return total;
    }
}
