package OOps;

public class Brother extends Parent{
    protected Brother(String name, int age) {
        super(name, age);
    }

    @Override
    public void check() {
        System.out.println("Đây là lớp Brother");
    }

    @Override
    public void check2() {
        System.out.println("Đây cũng là lớp Brother nhá");
    }
}
