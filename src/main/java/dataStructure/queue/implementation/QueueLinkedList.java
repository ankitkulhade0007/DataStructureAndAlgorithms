package dataStructure.queue.implementation;

class QueueLinkedList {

    QNode qNode;
    int front;
    int rear;

    public QueueLinkedList() {
        qNode = null;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }
    public void enqueue(int value) {
        QNode node = new QNode(value);
        node.setData(value);

        if(rear == -1){
            node.next = qNode;
        }



    }

    /*public int dequeue() {}

    public int front() {}
    public int rear() {}
    public void print() {}
    */

}
