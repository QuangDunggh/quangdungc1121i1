package com.Loops;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so ban muon kiem tra: ");
        int number = scanner.nextInt();
        String result = "";
        int confirm = 0;
        if (number == 2) {
            result = "Day la so nguyen to";
        } else if (number == 1) {
            result = "Day khong phai la so nguyen to";
        }
        else {
            for (int i = 2; i <= (number - 1); i++) {
                if (number % i == 0) {
                    confirm = -1;
                    break;
                } else {
                    confirm = 1;
                }
            }
        }

        if (confirm == -1) {
            result = "Day khong phai la so nguyen to!!!";
        } else if (confirm == 1) {
            result = "Day la so nguyen to";
        }
        System.out.println(result);
    }
}
