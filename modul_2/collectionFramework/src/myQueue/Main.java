package myQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(3);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.dequeue();
        myQueue.enqueue(99);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        System.out.println(myQueue.isQueueFull());
        System.out.println(myQueue.isQueueEmpty());
        myQueue.printQueue();
    }
}
