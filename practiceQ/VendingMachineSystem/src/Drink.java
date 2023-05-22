public class Drink extends Item{
    @Override
    String getInfo() {
        return "name: " + name + "price: "  + price + "quantity available: "+ quantityAvailable;
    }
    public Drink(String name, double price, int quantityAvailable) {
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }
}
