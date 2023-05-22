import java.util.ArrayList;

public class VendingMachine {
    private int maxCapacity = 50;
    private int currentCapacity = 0;
    protected ArrayList<Item> items = new ArrayList<>();

    public void addItems(Item item){
        items.add(item);
        currentCapacity++;
    }

}
