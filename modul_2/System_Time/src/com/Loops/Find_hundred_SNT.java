package com.Loops;

public class Find_hundred_SNT {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (check_SNT(i)) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static boolean check_SNT(int number) {
        boolean isSNT = true;
        if (number < 2) {
            isSNT = false;
        } else {
            for (int i = 2; i < number - 1; i++) {
                if (number % i == 0) {
                    isSNT = false;
                    break;
                } else {
                    isSNT = true;
                }
            }
        }
        return isSNT;
    }
}
