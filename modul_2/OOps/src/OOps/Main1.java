package OOps;

public class Main1 {
    public static void main(String[] args) {
      Child child = new Child("DŨng", 23);
      Brother brother = new Brother("Tùng", 23);
        show(child);
        show(brother);
    }

    private static void show(Parent people) {
        if(people instanceof Child) {
            System.out.println("Đây là của Child");
        }
        if (people instanceof Brother) {
            System.out.println("Đây là của Brother");
        }

    }


}
