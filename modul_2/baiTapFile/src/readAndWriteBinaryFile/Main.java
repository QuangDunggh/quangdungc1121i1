package readAndWriteBinaryFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String pathFile, List<Student> students) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(pathFile);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(students);
            os.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readFile(String pathFile) {
        List<Student> students = new ArrayList<>();
        try {
            InputStream is = new FileInputStream(pathFile);
            ObjectInputStream oss = new ObjectInputStream(is);
            students = (List<Student>) oss.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"C1121i1", "Quang Dung", 23);
        Student student2 = new Student(2,"C1121i1", "Thanh Tung", 23);
        Student student3 = new Student(3,"C1121i1", "Nhat Truong", 24);
        Student student4 = new Student(4,"C1121i1", "Phuong", 22);
        Student student5 = new Student(5,"C1121i1", "Dai Dương", 23);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        writeToFile("student.txt",students);
        List<Student> studentListFromFile =  readFile("student.txt");
        for (Student student: studentListFromFile) {
            System.out.println(student);
        }
    }
}
