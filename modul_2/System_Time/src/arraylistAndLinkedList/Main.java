package arraylistAndLinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(2, 99);
        arr.add(1,65);
        System.out.println(arr.getSize());
        arr.setPrint();
    }


}
