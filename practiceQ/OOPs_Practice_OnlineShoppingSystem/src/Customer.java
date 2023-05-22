import java.util.ArrayList;

public class Customer {
    private String name;
    private String address;
    private String paymentDetails;
    private ArrayList<Product> ShoppingCart;

    public Customer(String name, String address, String paymentDetails) {
        this.name = name;
        this.address = address;
        this.paymentDetails = paymentDetails;
        this.ShoppingCart = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", paymentDetails='" + paymentDetails + '\'' +
                ", ShoppingCart=" + ShoppingCart +
                '}';
    }
    public void addToShoppingCart(Product product, int quantity){
        for (int i = 0; i < quantity; i++) {
            ShoppingCart.add(product);
            int productqty = product.getAvailableQuantity();
            product.setAvailableQuantity(productqty-quantity);
        }
    }

    public void removeFromShoppingCart(Product product, int quantity){
        for (int i = 0; i < quantity; i++) {
            ShoppingCart.remove(product);
            int productqty = product.getAvailableQuantity();
            product.setAvailableQuantity(productqty+quantity);
        }
    }
    //checkout
    public Order checkout(){
        String order = "";
        double total = 0;
        for (Product product:ShoppingCart) {
            order += "\n" + product;
            total += product.getPrice();
        }
        String customerDetails = "name: " + name +
                "\n address: " + address +
                "\n payment details: " + paymentDetails +
                "\n order total: " + total +
                "\n order: " + "\n" + order;

        Order order1 = new Order(customerDetails);
        return order1;
    }


}
