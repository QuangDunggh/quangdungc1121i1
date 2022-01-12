package com.KeywordStatic;

public class Student {
    private int rollon;
    private String name;
    private static String college = "BBDT";

    public Student(int rollon, String name) {
        this.rollon = rollon;
        this.name = name;
    }

    static void change() {
        college = "codegym";
    }

    void display() {
        System.out.println(rollon + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(1121, "Dung");
        Student student2 = new Student(1121, "Tung");
        Student student3 = new Student(1121, "Truong");
        student1.display();
        student2.display();
        student3.display();
//        student1.change();
//        student1.display();

    }

}
