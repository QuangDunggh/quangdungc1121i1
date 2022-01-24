package exercise2;

public class Main {

        public static void main(String[] args) {
            MyLinkedListQueue queue = new MyLinkedListQueue();
            queue.Enqueue(10);
            queue.Enqueue(20);
//            queue.dequeue();
//            queue.dequeue();
            queue.Enqueue(30);
            queue.Enqueue(40);
            queue.Enqueue(50);
            System.out.println("Dequeued item is " + queue.dequeue().key);
        }
    }

