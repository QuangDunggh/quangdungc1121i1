package OOps;

public  class Parent extends Grand {
    private int age;

    protected Parent(String name,int age) {
        super(name);
        this.age = age;
    }

    public void check2() {
        System.out.println("Đây là cha tụi m");
    }

    @Override
    public void check() {
        System.out.println("Đây là thầy ông nậu");
    }
}
