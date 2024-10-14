package dataStructure.queue.implementation;


class QNode {
    int data;
    QNode next;

    QNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public QNode getNext() {
        return next;
    }

    public void setNext(QNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "QNode{" +
                "data=" + data +
                '}';
    }
}

