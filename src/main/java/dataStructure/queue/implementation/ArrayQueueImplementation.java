package dataStructure.queue.implementation;

public class ArrayQueueImplementation {
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.display();
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.enqueue(60);
        q.display();

        // Dequeue elements
        q.dequeue();
        q.dequeue();
        q.display();
        // Print front of the queue
        q.front();
    }
}

