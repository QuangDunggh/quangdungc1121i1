package readAndWriteBinaryFile;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String nameClass;
    private String name;
    private int age;
    public Student() {

    }

    public Student(int id, String nameClass, String name, int age) {
        this.id = id;
        this.nameClass = nameClass;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nameClass='" + nameClass + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
