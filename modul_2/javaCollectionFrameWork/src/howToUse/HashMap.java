package howToUse;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new java.util.HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 30);
        System.out.println("Display entry in Map: ");
        System.out.println(hashMap + "\n");
    }
}
