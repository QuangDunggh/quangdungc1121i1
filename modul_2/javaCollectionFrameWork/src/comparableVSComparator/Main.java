package comparableVSComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("Kien", 30, "HT");
        Students student2 = new Students("Nam", 26, "HN");
        Students student3 = new Students("Anh", 38, "HN");
        Students student4 = new Students("Tung", 38, "HT");
        List<Students> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);

        for (Students students: studentsList) {
            System.out.println(students);
        }

        Collections.sort(studentsList);

        System.out.println("After sort by Name: ");

        for (Students students: studentsList) {
            System.out.println(students);
        }

        System.out.println("Sort by Age: ");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentsList,ageComparator);
        for (Students students: studentsList) {
            System.out.println(students);
        }
    }
}
