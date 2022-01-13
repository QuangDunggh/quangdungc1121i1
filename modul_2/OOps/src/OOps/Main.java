package OOps;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Person.Address address = new Person.Address(128,"Phan Chu Trinh","Phuoc Vinh","Hue");
        Person person = new Person("Quang Dung", 23, 1919084791,
                1900,address );
        System.out.println(person);
        person.getAddress();
        System.out.println( person.getAddress());
    }
}
