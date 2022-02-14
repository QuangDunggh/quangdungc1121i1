package myQueue;

public class LinkedList<E> {
    private Node head;
    private int numNodes;

    class Node<E> {
        private E data;
        private Node next;

        public Node(E data) {
            data = (E) new Object();
        }

        public Object getData() {
            return data;
        }
    }

    public LinkedList() {
    }

    public E getFirst() {
        return (E) head;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        return (E) temp;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        holder = temp;
        temp.next = new Node<>(element);
        temp.next.next = holder;
    }
}
