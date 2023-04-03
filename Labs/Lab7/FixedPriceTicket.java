abstract public class FixedPriceTicket extends Ticket {
    private double price;

    public FixedPriceTicket(double price) {
        super();
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
