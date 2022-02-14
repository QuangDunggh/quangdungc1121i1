package howToUse;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("Display entries in ascending order in key: ");
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println("Display LinkedListMap: ");
        System.out.println(linkedHashMap);
    }
}
