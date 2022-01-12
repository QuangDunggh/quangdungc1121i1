//package com.array;
//
//import java.util.Scanner;
//
//public class Find_The_Most_Value_InArray {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the size: ");
//        int size = Integer.parseInt(input.nextLine());
//        int min = 0;
//        int max = 20;
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = (int)(Math.random() * (max - min + 1) + min);
//        }
//        for (int item: array) {
//            System.out.println(item);
//        }
//        System.out.println("Gia tri lon nhat trong mang la: " + findTheMostValue(array));
//    }
//    public  static int findTheMostValue(int[] arr) {
//        int size = arr.length;
//        int maxValue = arr[0];
//        for (int i = 0; i < size; i++) {
//            if (maxValue < arr[i]) {
//                maxValue = arr[i];
//            }
//        }
//        return maxValue;
//    }
//}
