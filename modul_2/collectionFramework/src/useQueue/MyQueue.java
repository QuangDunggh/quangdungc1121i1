package useQueue;

public class MyQueue {
    class Node {
        private int data;
        private Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", link=" + link +
                    '}';
        }
    }

    private Node front;
    private Node rear;

    public MyQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node temp = new Node(data);
        if (front == null && rear == null) {
            front = rear = temp;
        } else if (front != null && rear == null) {
            front = temp;
            rear.link = front;

        }
    }

    public Object dequeue() {
        if (front == null) {
            return null;
        }
        if (front == rear) {
            Node temp = front;
            front = rear = null;
            return temp;
        } else {
            Node temp = front;
            front = front.link;
            return temp;
        }
    }
}
