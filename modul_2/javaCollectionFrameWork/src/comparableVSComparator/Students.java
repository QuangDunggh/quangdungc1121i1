package comparableVSComparator;

public class Students implements Comparable<Students>{
    private String name;
    private int age;
    private String address;
    public Students() {

    }

    public Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        return this.getName().compareTo(o.getName());
    }
}
