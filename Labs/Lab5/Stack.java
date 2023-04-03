public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
            if(top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (top == null) {
            return 0;
        }
        int data = top.data;
        top = top.next;
        return data;
    }
    public String toString(){
        String str = "";

        for(Node curr=top; curr!=null; curr=curr.next){
            str=str+ " "+ curr.data;
        }
        return str;
    }
}