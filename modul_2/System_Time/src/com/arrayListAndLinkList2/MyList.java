//package com.arrayListAndLinkList2;
//
//import java.util.Arrays;
//
//public class MyList<E> {
//    private int size = 0;
//    static int DEFAULT_CAPACITY = 10;
//    private E[] elements;
//
//
//    public MyList() {
//        elements = (E[]) new Object[DEFAULT_CAPACITY];
//    }
//
//    private void setDefaultCapacity() {
//        this.DEFAULT_CAPACITY = elements.length * 2;
//        Arrays.copyOf(elements, this.DEFAULT_CAPACITY);
//    }
//
//    public void add(int index, E element) {
//        E temp = element;
//        if (size < DEFAULT_CAPACITY) {
//            for (int i = 0, j = 0; i < elements.length - 1; i++, j++) {
//                if (i == index) {
//                    elements[i] = temp;
//                    i++;
//
//                } else {
//                    elements[i] = elements[j];
//                }
//            }
//        } else if (size > DEFAULT_CAPACITY) {
//            setDefaultCapacity();
//            for (int i = 0, j = 0; i < elements.length - 1; i++, j++) {
//                if (i == index) {
//                    elements[i] = temp;
//                    i++;
////                    size++;
//                } else {
//                    elements[i] = elements[j];
//                }
//
//            }
//        }
//        size++;
//    }
//
//
//    public void printElements() {
//        System.out.print("[ ");
//        for (int i = 0; i < size; i++) {
//            System.out.print(elements[i] + ", ");
//        }
//        System.out.println("]");
//    }
//
//    public E remove(int index) {
//        E temp = null;
//        for (int i = 0, j = 0; i < elements.length - 1; i++, j++) {
//            if (index == i) {
//                temp = elements[i];
//                j++;
//                elements[i] = elements[j];
//            } else {
//                elements[i] = elements[j];
//            }
//        }
//        size--;
//        return temp;
//    }
//
//    public int getSize(){
//        return size;
//    }
//    public E[] clone() {
//        return elements;
//    }
//
//    public boolean contains (E o) {
//        boolean isThere = true;
//        for (int i = 0; i < size; i++) {
//            if(o == elements[i]){
//                isThere = true;
//                break;
//            } else {
//                isThere = false;
//            }
//        }
//        return isThere;
//    }
//
//    public int indexOf(E o) {
//        int temp = -1;
//        for (int i = 0; i < size; i++) {
//            if (o == elements[i]) {
//                temp = i;
//            }
//        }
//        return temp;
//    }
//
//    public E get(int index) {
//        E temp = null;
//        for (int i = 0; i < size; i++) {
//            if (index == i) {
//                temp = elements[i];
//            }
//        }
//        return temp;
//    }
//
//    public void clear() {
//        size -= size;
//        elements = (E[]) new Object[size];
//    }
//
//    public boolean add(E o ) {
//        boolean check = true;
//        add(size, o);
//        return check;
//    }
//}
