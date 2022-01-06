package com.company;

import java.util.Scanner;

public class hienthiloichao {
    public static void main(String[] args) {
        Scanner scaner = new Scanner((System.in));
        System.out.println("What is your name?");
        String name = scaner.nextLine();
        System.out.println("Hello " + name);
    }
}
