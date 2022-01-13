package OOps;

public abstract class Grand {
    private String lastName;
    protected Grand(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract void check();
}
