package com.Loops;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien ban muon vay: ");
        double tienVay = scanner.nextDouble();
        System.out.println("Nhap so thang ban muon vay: ");
        int month = scanner.nextInt();
        System.out.println("Lai suat theo thang");
        double laiSuat = scanner.nextDouble();
        double tienLai = 0;
        double total = 0;
        for (int i = 0; i < month; i++) {
            tienLai = tienVay * laiSuat / 100;
            tienVay = tienVay + tienLai;
            total = tienVay;
        }
        System.out.println("Tong so tien phai tra sau " + month + " la: " + total);
    }
}
