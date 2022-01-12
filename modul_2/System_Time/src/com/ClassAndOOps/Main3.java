package com.ClassAndOOps;

public class Main3 {
    public static void main(String[] args) {
//        HinhChuNhat.say();
//        System.out.println(HinhChuNhat.hi);

        HinhChuNhat.HinhVuong hinhVuong = new HinhChuNhat.HinhVuong(6);
        hinhVuong.getArea();
        System.out.println("Dây là diện tích hình vuông: " + hinhVuong.getArea());
    }
}
