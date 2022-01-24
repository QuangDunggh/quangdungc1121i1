package com.testCase;

public class CheckAngle {
    private double size1, size2, size3;

    public CheckAngle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public boolean checkAngle(double size1, double size2, double size3) {
        if (size1 + size2 > size3 && size1 + size3 > size2 && size2 + size3 > size1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIsoscelesTriangle(double size1, double size2, double size3) {
        if (checkAngle(size1, size2, size3)) {
            if (size1 == size2 || size1 == size3 || size2 == size3) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean checkEquilateralTriangle(double size1, double size2, double size3) {
        if (checkAngle(size1, size2, size3)) {
            if (size1 == size2 && size1 == size3 ) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
