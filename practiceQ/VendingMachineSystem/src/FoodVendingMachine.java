import java.util.ArrayList;

public class FoodVendingMachine extends VendingMachine{


    public String getItems(ArrayList<Item> items){
        for (Item var_item: items) {
            return items.toString();
        }
        return null;
    }
}
