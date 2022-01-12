package com.ClassAndOOps;

public class CoVu extends Animals {
    private boolean de = true;

    public CoVu() {

    }

    public CoVu(boolean de) {
        this.de = de;
    }

    public CoVu(int age, String name, double weight, double height, String leg, boolean de) {
        super(age, name, weight, height, leg);
        this.de = de;
    }

    @Override
    public String toString() {
        return "Đây là lớp CoVu, có tên là: " + getName() +
                (de ? " Là động vật đẻ con " : " là động vật đẻ trứng ") +
                " là lớp con của: " + super.toString();
    }

    public static void main(String[] args) {
        CoVu moVit = new CoVu(3,"Thu mo vit ",15.6, 0.3, "4 chân", false);
        System.out.println(moVit);
    }
}
