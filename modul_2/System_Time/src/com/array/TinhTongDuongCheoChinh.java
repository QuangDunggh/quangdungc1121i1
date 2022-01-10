package com.array;

import java.util.Scanner;

public class TinhTongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size in array: ");
        int size = Integer.parseInt(input.nextLine());
        int max = 20;
        int min = 2;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i] = new int[size];
            System.out.println("Array: " + i);
            for (int j = 0; j < size; j++) {
                array[i][j] = (int) (Math.random() * (max - min + 1) + min);
                System.out.println(array[i][j]);
            }
        }
        System.out.println("TOng duong cheo chinh la: " + totalMain(array));
    }
    public static int totalMain(int[][] arr) {
        int size = arr.length;
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += arr[i][i];
        }
        return total;
    }
}
