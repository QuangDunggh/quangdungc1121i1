package com.company;

import java.util.Scanner;

public class kiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam ban muon kiem tra: ");
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println("Day la nam nhuan!!!");
        } else if (year % 4 == 0 && year <= 100) {
            System.out.println("Day la nam nhuan!!!");
        } else {
            System.out.println("Day la nam khong nhuan");
        }
    }
}
