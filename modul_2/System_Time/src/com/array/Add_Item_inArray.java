//package com.array;
//
//import java.util.Scanner;
//
//public class Add_Item_inArray {
//    public static void main(String[] args) {
//        int[] array = new int[10];
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//        array[5] = 6;
//        for (int item : array) {
//            System.out.println(item);
//        }
//        System.out.println("New Array");
//        addItemInArray(array, 2, 99);
//        for (int item : array ) {
//            System.out.println(item);
//        }
//        System.out.println("New Array 1");
//        addItemInArray(array,5,60);
//        for (int item: array) {
//            System.out.println(item);
//        }
//    }
//
//    public static void addItemInArray(int[] arr, int index, int item) {
//        int size = arr.length;
//        int[] array = new int[size];
//        for (int i = 0, j = 0; j < size; i++, j++) {
//            if (index == j) {
//                array[j] = item;
//                i--;
//            } else {
//                array[j] = arr[i];
//            }
//        }
//        for (int i = 0; i < size; i++) {
//            arr[i] = array[i];
//        }
//
//
//    }
//}
