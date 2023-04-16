public class Truck {

    private final static int MAX_LOADING_CAPACITY = 20;
    private Stack stack;

    public Truck(Stack stack) {
        this.stack = stack;
    }

    public void load(Car car) {
        if (stack.size() <= MAX_LOADING_CAPACITY) {
            stack.push(car);
        }
    }

    public void unload() {
        if (!stack.isEmpty()) {
        }
    }

}