package arraylistAndLinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    static private int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyArrayList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int size) {
        elements = (E[]) new Object[size];
    }

    public void setDEFAULT_CAPACITY() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E data) {

        if (elements.length < DEFAULT_CAPACITY) {
            Object[] arr = (E[]) new Object[elements.length];
            for (int i = 0, j = 0; i < elements.length; i++, j++) {
                if (index == i) {
                    arr[i] = data;
                    j--;
                } else {
                    arr[i] = elements[j];
                }
            }
            for (int i = 0; i < elements.length; i++) {
                elements[i] = (E) arr[i];
            }
        } else {
            setDEFAULT_CAPACITY();
            Object[] arr = (E[]) new Object[elements.length];
            int newSize = elements.length * 2;
            arr = Arrays.copyOf(arr, newSize);
            for (int i = 0, j = 0; i < elements.length; i++, j++) {
                if (index == i) {
                    arr[i] = data;
                    j--;
                } else {
                    arr[i] = elements[j];
                }
            }
            for (int i = 0; i < elements.length; i++) {
                elements[i] = (E) arr[i];
            }
        }
        size++;
    }

    public void add(E data) {
        if (size < DEFAULT_CAPACITY) {
            for (int i = 0; i < elements.length; i++) {
                if (size == i) {
                    elements[i] = data;
                }
            }
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public void setPrint() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + ", ");
        }
        System.out.println("]");
    }
}
