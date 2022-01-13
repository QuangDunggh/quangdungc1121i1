package OOps;

public class Test implements Move{

    @Override
    public void show() {
        System.out.println("Triên khai interface");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.show();
    }
}
