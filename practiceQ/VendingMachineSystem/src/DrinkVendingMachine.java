import java.util.ArrayList;

public class DrinkVendingMachine extends VendingMachine{

    public ArrayList<Item> getItems(){
        ArrayList<Item> drink_items = new ArrayList<Item>();
        for (Item var_item: items) {
            if (var_item instanceof Drink){
                drink_items.add(var_item);
            }
        }
        return drink_items;
    }

}
