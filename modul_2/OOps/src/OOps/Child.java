package OOps;

public class Child extends Parent{

    public Child(String name, int age) {
        super(name, age);
    }


    @Override
    public void check() {
        System.out.println("Đây là thầy ông nội");
    }

    @Override
    public void check2() {
        System.out.println("Đây là nhất nguyên");
    }
}
