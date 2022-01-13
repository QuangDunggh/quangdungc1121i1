package com.inheritance5;
public class Xe {
    private String color;
    private String dongCo;
    private String hang;
    public Xe(){}

    public Xe(String color, String dongCo, String hang) {
        this.color = color;
        this.dongCo = dongCo;
        this.hang = hang;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDongCo() {
        return dongCo;
    }

    public void setDongCo(String dongCo) {
        this.dongCo = dongCo;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    public void tangToc(){
        System.out.println();
    }

    @Override
    public String toString() {
        return " Đây là xe có mau  " + color + " có động cơ là " + dongCo + " thuộc hãng  " + hang;
    }
}
