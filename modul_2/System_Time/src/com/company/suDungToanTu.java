package com.company;

import java.util.Scanner;

public class suDungToanTu {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhap chieu dai");
       float width = scanner.nextFloat();
       System.out.println("Nhap chieu rong");
       float height = scanner.nextFloat();
       float result = width * height;
       System.out.println("Dien tich hien chu nhat la: " + result);
   }

}
