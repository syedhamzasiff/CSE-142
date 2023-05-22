public class Product {
    private int productID;
    private String name;
    private double price;
    private int availableQuantity;
    private int uniqueID = getUniqueID();

    public Product(String name, double price, int availableQuantity) {
        this.productID = uniqueID;
        this.name = name;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }
    private int getUniqueID(){
        return (int) (Math.random()*1000);
    }


    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
