package exercise2;

public class MyLinkedListQueue<T> {
    class Node {
        public int key;
        private Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    '}';
        }
    }

    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void Enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            head = tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue(){
        if(head == null) {
            return null;
        }
        Node temp = this.head;
        head = head.next;
        if(head == null) {
            this.tail = null;
        }
        return temp;
    }

    @Override
    public String toString() {
        return "MyLinkedListQueue{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
