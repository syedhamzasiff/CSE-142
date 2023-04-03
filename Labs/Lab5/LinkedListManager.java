class LinkedListManager {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        System.out.println("append");
        l.append(45);
        l.append(33);
        l.append(82);
        l.append(72);
        l.append(33);
        l.printList(l);
        System.out.println();
        System.out.println();

        System.out.println("remove");
        l.remove(82);
        l.printList(l);
        System.out.println();
        System.out.println();

        System.out.println("add");
        l.add(4,58 );
        l.printList(l);
        System.out.println();
        l.add(2,42);
        l.printList(l);
        System.out.println();
        System.out.println();

        System.out.println("removeAt");
        l.removeAt(3);
        l.printList(l);
        System.out.println();
        System.out.println();

        System.out.println("removeAll");
        l.removeAll(33);
        l.printList(l);
        System.out.println();
        System.out.println();

        System.out.println("extractASCII");
        l.extractASCII("hamza");
        l.printList(l);
        System.out.println();
        System.out.println();

        System.out.println("retrieveASCII");
        System.out.println(l.retrieveASCII());
        System.out.println();

        System.out.println("reverselist");
        l.reverseList();
        l.printList(l);
        System.out.println();
        System.out.println();

        LinkedList l2 = new LinkedList();
        l2.append(1);
        l2.append(1);
        l2.append(2);
        l2.append(2);
        l2.append(3);
        l2.append(3);
        l2.printList(l2);
        System.out.println();
        System.out.println("removeDuplicate:");
        l2.removeDuplicate();
        l2.printList(l2);
        System.out.println();
        System.out.println();

        System.out.println("stack");
        Stack stack = new Stack();
        stack.push(66);
        stack.push(55);
        stack.push(52);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}