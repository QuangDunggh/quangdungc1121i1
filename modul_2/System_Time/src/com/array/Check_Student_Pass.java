//package com.array;
//
//import java.util.Scanner;
//
//public class Check_Student_Pass {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the quantity student in the Exam: ");
//        int size = Integer.parseInt(input.nextLine());
//        if (size > 30) {
//            System.out.println("It is too much!!");
//            return;
//        }
//        int max = 10;
//        int min = 0;
//        int[] pointOfStudent = new int[size];
//        for (int i = 0; i < size; i++) {
//            pointOfStudent[i] = (int) (Math.random()*(max - min + 1) + min);
//        }
//        System.out.println("Diem cua cac sinh vien: ");
//        for (int item: pointOfStudent) {
//            System.out.println(item);
//        }
//        System.out.println("Diem cua cac hoc sinh da Pass la: ");
//        studentPass(pointOfStudent);
//    }
//    public static void studentPass(int[] arr) {
//        int size = arr.length;
//        int total = 0;
//        for (int i = 0; i < size; i++) {
//            if (arr[i] > 5) {
//                total += 1;
//                System.out.println(arr[i]);
//            }
//        }
//        System.out.println("So luong sinh vien do la: " + total);
//
//    }
//}
