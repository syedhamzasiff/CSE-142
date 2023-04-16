import java.util.NoSuchElementException;

public class Stack {

    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void push(Car data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
        size++;
    }

    public Car pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        Node node = top;
        top = top.next;
        node.next = null;
        size--;
        return (Car) node.data;
    }

}
