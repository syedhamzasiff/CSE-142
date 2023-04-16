import java.util.NoSuchElementException;

public class Queue {

    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }
    public boolean isEmpty() {
        return front == null;
    }
    public void enqueue(Truck data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public Truck dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        Node temp = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return (Truck) temp.data;
    }
    public int size() {
        int count = 0;
        Node current = front;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

}