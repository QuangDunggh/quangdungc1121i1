package Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Dung", 18, true),
                new Student("Dung", 18, false),
                new Student("Truong", 18, true),
                new Student("Phuong", 18, false),
                new Student("Duong", 25, true)
        };
        Comparator<Student> sortName = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o2.name.compareTo(o1.name);
                if (result == 0) {
                    return o2.age - o1.age;
                }
                return result;
            }
        };

        List<Student> foundStudent = searchStudentsByAge(students, 18);

        foundStudent.sort(sortName);
        for (Student student : foundStudent) {
            System.out.println(student);
        }
    }

    public static Student searchByAge(Student[] students, int age) {
        int size = students.length;
        for (int i = 0; i < size; i++) {
            if (age == students[i].age) {
                return students[i];
            }
        }
        return null;
    }

    public static List<Student> searchStudentsByAge(Student[] students, int age) {
        List<Student> foundStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.age == age) {
                foundStudents.add(student);
            }
        }
        return foundStudents;
    }


}

