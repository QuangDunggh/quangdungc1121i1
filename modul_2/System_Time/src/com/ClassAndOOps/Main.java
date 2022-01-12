package com.ClassAndOOps;

public class Main {
    public static void main(String[] args) {
        Beer huda = new Beer("Huda Hue", 12000, 24, 04);
        System.out.println(huda.getPrice());
        Beer heniken = new Beer("Heniken", 20000, 12, 5);
        Beer tiger = new Beer(heniken);
        Beer uha = new Beer(heniken);
//        System.out.println(tiger.getId());
//        System.out.println(huda.getId());
        System.out.println(uha.getName());




    }
    public static void check(Beer beer) {
        System.out.println(beer.getId());
        System.out.println(beer.getPrice());

    }

}
