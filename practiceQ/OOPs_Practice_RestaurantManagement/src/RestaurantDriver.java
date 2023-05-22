public class RestaurantDriver {
    public static void main(String[] args) throws InvalidMenuItemException {
        MenuItemFactory menuItemFactory = new MenuItemFactory();

        MenuItem menuItem = menuItemFactory.createMenuItem(3);
        System.out.println(menuItem);
    }
}
