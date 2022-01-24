//package com.arrayListAndLinkList;
//
//import java.util.Arrays;
//
//public class MyList<E> {
//    private int size = 0;
//    private int DEFAULT_CAPACITY = 10;
//    private E[] elements;
//
//    public MyList() {
//        elements = (E[]) new Object[DEFAULT_CAPACITY];
//    }
//
////    public MyList(int size, int DEFAULT_CAPACITY, E[] element) {
////        this.size = size;
////        this.DEFAULT_CAPACITY = DEFAULT_CAPACITY;
////        this.element = element;
////    }
//
//
//    public void addElement(E element) {
//        if (size == elements.length) {
//            setDEFAULT_CAPACITY();
//        }
//        elements[size++] = element;
//    }
//
//    public void setDEFAULT_CAPACITY() {
//        this.DEFAULT_CAPACITY = elements.length * 2;
//        Arrays.copyOf(elements, this.DEFAULT_CAPACITY);
//    }
//
//    public E getIndex(int i) {
//        if(i > size || i < 0) {
//            throw new IndexOutOfBoundsException("Không có vị trí phần tử này");
//        }
//        return  elements[i];
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//
//}
