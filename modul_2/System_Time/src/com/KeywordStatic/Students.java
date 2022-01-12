package com.KeywordStatic;

public class Students {
    private String name = "John";
    private String classes = "C02";

    public Students() {
    }

    public Students(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Students student1 = new Students();
        student1.setClasses("C1121i1");
        student1.setName("Tung lz");
        System.out.println(student1);


    }
}
