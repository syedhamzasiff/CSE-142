public class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(int numOfDays) {
        super(numOfDays);
    }

    public double getPrice() {
        return super.getPrice() / 2.0;
    }

    public String toString() {
        return super.toString() + "(Student)";
    }
}
