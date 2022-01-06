package com.codegym;
import java.util.Scanner;

public class example {
    public static  void main(String[] args) {
//    math();
    switchCase();
    }
    public  static  void math() {
        float height;
        float width;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height :");
        height = scanner.nextFloat();
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        float area = height * width;
        System.out.println("Dien tich la: " + area);
    }
    public  static  void  switchCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is grade?");

        String grade = scanner.nextLine();
        switch (grade) {
            case "A" :
                System.out.println("Excellent!!!");
                break;
            case "B" :
                System.out.println("Good job");
                break;
            case "C" :
                System.out.println("Try your best");
                break;
            case "D" :
                System.out.println("You Fail");
                break;
            default:
                System.out.println("Error! Invalid grade");
        }
    }
}
