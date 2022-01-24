package mapCollectionFrameWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> myMap = new HashMap<>();
        myMap.put(123, "Duong");
        myMap.put(124, "Tung");
        myMap.put(125, null);
        myMap.put(125, "Truong");
        myMap.put(126, "Phuong");
        myMap.put(127, "Dung");
        myMap.put(null,"?");
        Set<Integer> list = myMap.keySet();
        for (Integer key: list) {
            System.out.println("Key" + key + ": " + myMap.get(key));
        }
        myMap.put(123, "Cu");
        System.out.println("after");
        for (Integer key: list) {
            System.out.println("Key" + key + ": " + myMap.get(key));
        }

    }

}
