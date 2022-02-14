package howToUse;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new java.util.TreeMap<>();
        treeMap.put("Smith", 30);
        treeMap.put("Anderson", 31);
        treeMap.put("Lewis", 29);
        treeMap.put("Cook", 33);
        System.out.println("Display entries in ascending order of key ");
        System.out.println(treeMap);
    }
}
