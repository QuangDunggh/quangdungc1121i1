package OOps;

public class Uncle extends Grand{
    public Uncle(String lastName) {
        super(lastName);
    }

    @Override
    public void check() {
        System.out.println("Ông nậu");
    }
}
