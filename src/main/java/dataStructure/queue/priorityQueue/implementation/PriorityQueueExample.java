package dataStructure.queue.priorityQueue.implementation;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(14);
        pq.add(21);
        pq.add(11);
        pq.add(31);

        System.out.println("pq :- " + pq);
        System.out.println("pq.peek() :- " + pq.peek());
        System.out.println("pq.contains(14) :- " + pq.contains(14));
        System.out.println("pq.poll() :- " + pq.poll());
        System.out.println("PQ :- " + pq);
        System.out.println("pq.offer(6) :- " + pq.offer(6));
        System.out.println("pq :- " + pq);

        Iterator<Integer> itr = pq.iterator();
        while (itr.hasNext()) {
            System.out.println("itr :- " + itr.next());
        }
        pq.forEach(System.out::println);

/*
    why am i ot getting result as [1, 2, 3, 4, 11, 14, 21, 31]  sorted order instead i am getting result as [1, 3, 2, 11, 21, 14, 4, 31]
Answer
    The behavior you are observing when printing the PriorityQueue is expected. The PriorityQueue in Java does not maintain the elements in sorted order when you iterate over it or print it directly. Instead, it guarantees that the smallest element (based on natural ordering or a specified comparator) will be at the head of the queue, but the order of the remaining elements is not guaranteed.

    To obtain a sorted order of elements, you can either:

    Poll Elements from the PriorityQueue: Continuously poll elements from the PriorityQueue until it's empty. This will give you the elements in sorted order:
 */
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        priorityQueueWithCustomComparator();
    }

    public static void priorityQueueWithCustomComparator() {
        // PriorityQueue with custom comparator (largest element first)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // Add elements to the PriorityQueue
        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        System.out.println("PriorityQueue: " + pq);

        System.out.println("Polled element: " + pq.poll()); // 40
        System.out.println("PriorityQueue after poll: " + pq);
    }
}
