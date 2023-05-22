public class MenuItemFactory {

    public MenuItem createMenuItem(int menuChoice) throws InvalidMenuItemException {
        MenuItem menuItem = null;
        switch (menuChoice) {
            case 1:
                return new Burger();
            case 2:
                return new Pizza();
            case 3:
                return new Salad();
            default: throw new InvalidMenuItemException("Invalid Menu Item");
        }
    }

}
