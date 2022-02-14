package checkStringPalindrome;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String str = scanner.nextLine().toLowerCase();
        char[] arr = str.toCharArray();
        Stack<Character> arr1 = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            arr1.push(arr[i]);

        }
        Queue<Character> arr2 = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            arr2.add(arr[i]);
        }
        boolean check = false;
        for (int i = 0; i < str.length(); i++) {
            if (arr1.pop() != arr2.remove()){
                check = false;
                break;
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("Dãy này là dãy Palindrome");
        } else {
            System.out.println("Dãy này không phải là dãy Palindrome");
        }

    }
}
