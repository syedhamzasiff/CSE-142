public class TransportingFerry {

    private final static int MAX_LOADING_CAPACITY = 50;
    private Queue queue;

    public TransportingFerry(Queue queue) {
        this.queue = queue;
    }

    public void load(Truck truck) {
        if (queue.size() <= MAX_LOADING_CAPACITY) {
            queue.enqueue(truck);
        }
    }

    public void unload() {
        if (!queue.isEmpty()) {
        }
    }

}
