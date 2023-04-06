import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> linkedList = new LinkedList<Address>();

        linkedList.add(new Address("A", "11 Ave", "U", "IL", "11111" ));
        linkedList.add(new Address("R", "11 Lane", "M", "IL", "22222"));
        linkedList.add(new Address("T", "8 St", "C", "IL", "33333" ));

        for (Address address: linkedList) {
            System.out.println(address.toString());
        }
    }
}
