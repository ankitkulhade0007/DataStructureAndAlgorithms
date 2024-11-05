package dataStructure.queue.priorityQueue.implementation;

public class PQNode {

    int data;
    int priority;
    PQNode next;

    public PQNode() {
    }

    public PQNode(int data, int priority) {
        PQNode temp = new PQNode();
        temp.data = data;
        temp.priority = priority;
        this.next = null;
    }
}
