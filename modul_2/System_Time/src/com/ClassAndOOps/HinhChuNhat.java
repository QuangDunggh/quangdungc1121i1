package com.ClassAndOOps;

public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;
    private String color = "red";
    private boolean filled = true;
    static String hi = "hello";

    public static void say() {
        System.out.println("Tao là hinh chữ nhật!!!");
        hi = " ";

    }

    static {
        System.out.println("Dây là khối static");
        hi = "Hello con cặc!!!";
    }

//    public HinhChuNhat() {
//    }
//
//    public HinhChuNhat(int chieuDai, int chieuRong, String color, boolean filled) {
//        this.chieuDai = chieuDai;
//        this.chieuRong = chieuRong;
//        this.color = color;
//        this.filled = filled;
//    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        if (chieuDai < 0) {
            this.chieuDai = 0;
        } else {
            this.chieuDai = chieuDai;
        }

    }

    public int getChieuRong() {
        return chieuRong;

    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
        say();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;

    }

    public int getArea() {
        return this.chieuDai * this.chieuRong;
    }

    public int getPerimeter() {
        return 2 * (this.chieuRong + this.chieuRong);
    }

    public static void main(String[] args) {
        say();
        HinhChuNhat hinhNhat = new HinhChuNhat();
        hinhNhat.getPerimeter();
    }

    static class HinhVuong {
        private int size;

        public HinhVuong(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getArea() {
            return this.size * this.size;
        }

        public int getPerimeter() {
            return 4 * this.size;
        }
    }


}
