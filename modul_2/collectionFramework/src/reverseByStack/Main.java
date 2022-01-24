package reverseByStack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<>();
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.print("Element in array: ");
        for (int item: array) {
            System.out.print(item + " ");
            arr.push(item);
        }
        System.out.println("\nAfter: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = arr.pop();
            System.out.print(array[i] + " ");
        }

    }
}
