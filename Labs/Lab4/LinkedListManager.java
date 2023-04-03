public class LinkedListManager {

    public static void main ( String [] args ){
        LinkedList l = new LinkedList ();

        l.add(11, 1);
        l.add(22, 2);
        l.add(33,3);
        l.add(44,4);

        l.printList(l);

        l.removeSpecific(3);
        l.printList(l);

        l.append(5);
        l.printList(l);





     }
}
