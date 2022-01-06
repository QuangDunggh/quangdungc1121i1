package com.company;
import java.util.Scanner;
public class chiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can nang cua ban la: ");
        double weight = scanner.nextDouble();
        System.out.println("Chieu cao cua ban la: ");
        double height = scanner.nextDouble();
        double result = weight / (height * height);
        if (result < 18.5) {
            System.out.println("Underweight");
        } else if (result < 25.0) {
            System.out.println("Normal");
        } else if (result < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
