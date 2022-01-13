package com.inheritance5;

public class Main {
    public static void main(String[] args) {
        Xe xe = new XeDua(1,"Xanh", "V12","Honda");
        System.out.println(xe);
        System.out.println(xe.getColor());
        Xe xe1 =  new XeDua(1,"Do", " V8" , "Fe");
        System.out.println( xe1.getColor());
        XeDua xe2 = (XeDua)xe;
        System.out.println(xe2);
        xe1.tangToc();
        Xe xeTai = new XeTai("vang","F", "RR");
        xeTai.tangToc();
    }
}
