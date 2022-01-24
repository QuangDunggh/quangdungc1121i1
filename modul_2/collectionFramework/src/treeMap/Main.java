package treeMap;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = input.nextLine();
        String str2 = str.toLowerCase();
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        for (int i = 0; i < str2.length(); i++) {
            int temp = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str2.charAt(i) == str2.charAt(j)) {
                    temp++;
                }
            }
            map.put(str2.charAt(i), temp);

        }
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
