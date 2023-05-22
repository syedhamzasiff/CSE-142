public class Main {
    public static void main(String[] args) {
        InventoryManagement inventoryManagement = new InventoryManagement();

        Product tshirt = new Clothing("black tee", 5.0, 40);
        Product hairdryer = new Electronics("hardryer", 30.5, 10);
        Product harrypotter = new Books("harry potter", 2.0, 15);

        inventoryManagement.Inventory.add(tshirt);
        inventoryManagement.Inventory.add(hairdryer);
        inventoryManagement.Inventory.add(harrypotter);

        Customer customer = new Customer("hamza", "his home", "3424-23432-4353");

        customer.addToShoppingCart(tshirt, 5);
        customer.addToShoppingCart(hairdryer, 4);
        customer.addToShoppingCart(harrypotter, 2);

        customer.removeFromShoppingCart(tshirt, 2);

        System.out.println(customer.checkout());


    }
}
