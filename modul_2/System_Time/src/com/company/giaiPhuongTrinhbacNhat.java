package com.company;

import java.util.Scanner;

public class giaiPhuongTrinhbacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cho phuong trinh ax + b = 0");
        System.out.println("Nhap so a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhap so b:" );
        float b = scanner.nextFloat();
        if (a == 0) {
            System.out.println("Phuong tring vo nghiem");
            return;
        }
        float result = -b / a;
        System.out.println("Ket qua cua phuong trinh la: " + result);
    }
}
