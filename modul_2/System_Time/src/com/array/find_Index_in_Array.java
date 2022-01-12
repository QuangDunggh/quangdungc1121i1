//package com.array;
//
//import java.util.Scanner;
//
//public class find_Index_in_Array {
//    public static void main(String[] args) {
//        String[] listClass = {"Quang Dung", "Nhat Truong", "Thanh Tung", "Anh Tuan", "Phuong"};
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the name: ");
//        String name =  input.nextLine();
//        boolean check = true;
//        int index = 0;
//        for (int i = 0 ; i < listClass.length; i++) {
//            if (listClass[i].equals(name)) {
//                check = true;
//                index = i;
//                System.out.println(name + " co vi tri trong danh sach la: " + index);
//                break;
//            } else {
//                check = false;
//
//            }
//        }
//        if (!check) {
//            System.out.println("Khong co trong danh sach!!!");
//        }
//
//
//    }
//}
