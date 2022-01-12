//package com.array;
//
//import java.util.Scanner;
//
//public class reverse_Array_2 {
//    public static void main(String[] agrs) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Nhap chieu dai cua mang: ");
//        int size = 0;
//        do {
//             size = Integer.parseInt(input.nextLine());
//             if (size > 20) {
//                 System.out.println("Size does not exceed 20");
//                 System.out.print("Nhap lai chieu dai cua mang: ");
//             }
//        } while (size > 20);
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            System.out.print("Enter the Items in the Array: ");
//            array[i] = Integer.parseInt(input.nextLine());
//        }
//        System.out.println("Item in the Array is:");
//        for (int item: array) {
//            System.out.println(item);
//        }
//        for (int i = 0; i < size/2; i++) {
//            int temp = array[i];
//            array[i] = array[size - 1 - i];
//            array[size - 1 - i] = temp;
//        }
//        System.out.println("Cac phan tu sau khi reverse:");
//        for (int item: array) {
//            System.out.println(item);
//        }
//
//
//    }
//}
