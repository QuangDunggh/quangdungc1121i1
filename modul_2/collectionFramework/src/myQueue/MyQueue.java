package myQueue;

public class MyQueue {
    private int capacity;
    private Integer[] queueArr;
    private int head;
    private int tail;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        queueArr = new Integer[queueSize];
    }

    public boolean isQueueFull() {
        if (currentSize == queueArr.length) {
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty() {
        if (currentSize == 0) {
            return true;
        }
        return false;
    }

    public void enqueue(int item) {
        int size = queueArr.length;
        if (isQueueFull()) {
            System.out.println("Overload! Unable to add element!!!");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (queueArr[i] == null) {
                queueArr[i] = item;
                break;
            }
        }
        currentSize++;
    }

    public void dequeue() {
        int size = queueArr.length;
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
            return;
        }
        for (int i = 0, j = 1; i < size; i++, j++) {
            if (i == size - 1) {
                queueArr[i] = null;
            } else {
                queueArr[i] = queueArr[j];
            }

        }
        currentSize--;
    }

    public void printQueue() {
        System.out.print("[");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queueArr[i]);
            if (i < currentSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
