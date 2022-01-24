//package com.arrayListAndLinkList2;
//
//import com.arrayListAndLinkList.MyLinkList;
//
//import java.util.LinkedList;
//
//public class MyLinkedList<T> {
//    private Node head;
//    private int numNodes;
//
//    public MyLinkedList() {
//    }
//
//    public MyLinkedList(Object data) {
//        head = new Node(data);
//        numNodes = 1;
//    }
//
//    class Node {
//        private Node next;
//        private Object data;
//        public Node(){}
//        public Node(Object data) {
//            this.data = data;
//        }
//
//        public Object getData() {
//            return data;
//        }
//
//        @Override
//        public String toString() {
//            return "Node{" +
//                    "next=" + next +
//                    ", data=" + data +
//                    '}';
//        }
//    }
//
//    public void add(int index, T element) {
//        Node temp = null;
//        if (head == null) {
//            head = new Node(element);
//        } else {
//            temp = head;
//            Node holder;
//            for (int i = 0; i < index - 1 && temp.next != null; i++) {
//                temp = temp.next;
//            }
//            holder = temp.next;
//            temp.next = new Node(element);
//            temp.next.next = holder;
//        }
//        numNodes++;
//
//    }
//
//    public void setFirst(T data) {
//        Node temp = head;
//        head = new Node(data);
//        head.next = temp;
//        numNodes++;
//    }
//
//    public void setLast(T data) {
//        Node temp = head;
////        for (int i = 0; i < numNodes; i++){
////            temp = temp.next;
////        }
////        while (temp != null) {
////            temp = temp.next;
////        }
////        temp = new Node(data);
////        numNodes++;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = new Node(data);
//        numNodes++;
//    }
//
//    public T getLast() {
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        return (T) temp.data;
//    }
//
//    private void setLastResort(){
//        Node temp = head;
//        for (int i =0; i < numNodes - 2; i++){
//            temp = temp.next;
//        }
//        temp.next = null;
//    }
//    public void printList() {
//        Node temp = head;
////        for (int i = 0; i < numNodes; i++) {
////            System.out.print(temp.data + " ");
////            temp = temp.next;
////        }
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//    }
//
//    public T remove(int index) {
//        Node temp = head;
//        T holder = null;
//        if (index == 0) {
//            head = temp.next;
//        } else {
//            for (int i = 0; i < numNodes; i++) {
//                if (index - 1 == i) {
//                    holder = (T) temp.data;
//                    temp.next = temp.next.next;
//                } else {
//                    temp = temp.next;
//                }
//            }
//        }
//        numNodes--;
//        return holder;
//    }
//
//    public boolean remove1(T data) {
//        boolean check = true;
//        Node temp = head;
//        if (data == temp.data) {
//            head = temp.next;
//            check = true;
//        } else if (data.equals(getLast())) {
//            setLastResort();
//            check = true;
//        } else {
//            for (int i = 0; i < numNodes; i++) {
//                temp = temp.next;
//                if (data == temp.next.data) {
//                    temp.next = temp.next.next;
//                    check = true;
//                    break;
//                } else {
//                    check = false;
//                }
//
//            }
//        }
//        numNodes--;
//        return check;
//    }
//
////    public boolean remove1(T data) {
////        Node temp = head;
////        if (temp == null)
////            return false;
////
////        while (temp.next != null) {
////            System.out.println(temp.data);
////            if (temp.next.data == data) {
////                temp.next = temp.next.next;
////                return true;
////            }
////            temp = temp.next;
////        }
////        if (temp.data == data) {
////            temp = null;
////            return true;
////        }
////        return false;
////    }
//    public T getFirst(){
//        return (T) head.data;
//    }
//
//    public boolean contains(T data) {
//        boolean check = true;
//        Node temp = head;
//        if(data.equals(temp.data)){
//            check =true;
//        } if(data.equals(getLast())){
//            check = true;
//        }
//        else {
//            while (temp.next != null) {
//                if(data.equals(temp.data)) {
//                    check = true;
//                    break;
//                } else {
//                    check = false;
//                }
//                temp = temp.next;
//            }
//        }
//        return check;
//    }
//
//    public int indexOf(T data) {
//        Node temp = head;
//        Integer num = null ;
//        for (int i = 0; i < numNodes; i++) {
//            if(data.equals(temp.data)){
//                num = i;
//                break;
//            }
//            temp = temp.next;
//        }
//        return num;
//    }
//
//}
