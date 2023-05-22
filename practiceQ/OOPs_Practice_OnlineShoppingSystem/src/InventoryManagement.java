import java.util.ArrayList;

public class InventoryManagement {
    ArrayList<Product> Inventory;

    public InventoryManagement() {
        Inventory = new ArrayList<>();
    }
    public void addProduct_inv(Product product){
        Inventory.add(product);
    }
    public void removeProduct_inv(Product product){
        Inventory.remove(product);
    }
    public void viewInventory(){
        for (Product product : Inventory) {
            System.out.println(product);
            System.out.println(product.getAvailableQuantity());
        }
    }
}
