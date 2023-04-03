
public class TicketOrder {
    public static void main(String[] args) {

        Ticket[] tickets = new Ticket[5];
        tickets[0] = new WalkupTicket();
        tickets[1] = new ComplimentaryTicket();
        tickets[2] = new AdvanceTicket(10);
        tickets[3] = new StudentAdvanceTicket(5);
        tickets[4] = new AdvanceTicket(34);


        for (Ticket ticket: tickets) {
            System.out.println(ticket);
        }
    }
}
