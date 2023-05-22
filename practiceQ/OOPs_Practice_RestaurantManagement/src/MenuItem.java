import java.util.List;

public abstract class MenuItem {
    private String name;
    private float price;
    private String[] ingredients;

    public MenuItem(String name, float price, String[] ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return name + '\'' + price;
    }
}
