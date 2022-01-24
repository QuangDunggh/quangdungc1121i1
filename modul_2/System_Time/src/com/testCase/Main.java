package com.testCase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size1 in Angle: ");
        double size1 = Double.parseDouble(input.nextLine());
        System.out.print("Enter size2 in Angle: ");
        double size2 = Double.parseDouble(input.nextLine());
        System.out.print("Enter size3 in Angle: ");
        double size3 = Double.parseDouble(input.nextLine());
        CheckAngle angle = new CheckAngle(size1, size2, size3);
        check(angle);


    }

    private static void check(CheckAngle angle) {
        if(angle.checkEquilateralTriangle(angle.getSize1(), angle.getSize2(), angle.getSize3())){
            System.out.println("Đây là tam giác đều");
        } else if(angle.checkIsoscelesTriangle(angle.getSize1(), angle.getSize2(), angle.getSize3())){
            System.out.println("Đây là tam giác cân");
        } else if(angle.checkAngle(angle.getSize1(), angle.getSize2(), angle.getSize3())){
            System.out.println("Đây là tam giác thường");
        } else {
            System.out.println("Đây không phải là tam giác");
        }
    }
}
