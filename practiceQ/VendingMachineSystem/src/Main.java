import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DrinkVendingMachine mach1 = new DrinkVendingMachine();
        mach1.addItems(new Drink("Iced Mocha", 16.99, 7));
        mach1.addItems(new Snack("Cheetos", 4.99, 30));
        mach1.addItems(new Candy("mentos", 1.99, 20));

        ArrayList<Item> items = mach1.getItems();
        for (Item item: mach1.items) {
            System.out.println(item.getInfo());
        }


    }
}