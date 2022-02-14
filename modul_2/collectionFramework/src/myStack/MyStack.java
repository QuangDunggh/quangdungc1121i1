package myStack;

import myQueue.Main;

public class MyStack {
    private Integer[] arr;
    private int size;
    private int currentSize = 0;

    public MyStack(int size) {
        arr = new Integer[size];
    }

    public boolean isEmpty() {
        if (currentSize == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (currentSize == arr.length) {
            return true;
        }
        return false;
    }

    public void push(int element) {
        int size = arr.length;
        if (isFull()) {
            System.out.println("Không nhét được nữa, to quá!!!");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] == null) {
                arr[i] = element;
                break;
            }
        }
        currentSize++;
    }

    public void pop() {
        int size = arr.length;
        if (isEmpty()) {
            System.out.println("Hết phần tử để lấy rồi!!!");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                arr[i] = null;
            }
        }
        currentSize--;
    }

    public void printArr() {
        System.out.print("[");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(arr[i]);
            if (i < currentSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
