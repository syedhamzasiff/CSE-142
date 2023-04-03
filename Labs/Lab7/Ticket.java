import java.util.ArrayList;

abstract public class Ticket {
    private int serialNumber;
    private double price;

    public abstract double getPrice();

    public int getSerialNumber() {
        return serialNumber;
    }

    public String toString() {
        return "SN: " + getSerialNumber() + ", $" + getPrice();
    }

    public static ArrayList<Integer> assignedSerialNumbers = new ArrayList<>();

    private int randomSerialNumber() {
        int newSerialNumber = (int) (Math.random()*100000);
        while (assignedSerialNumbers.contains(newSerialNumber)) {
            newSerialNumber = (int) (Math.random()*100000) ;
        }
        assignedSerialNumbers.add(newSerialNumber);
        return newSerialNumber;
    }

    public Ticket() {
        this.price = price;
        this.serialNumber = randomSerialNumber();
    }

}
