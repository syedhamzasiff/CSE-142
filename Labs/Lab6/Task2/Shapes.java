abstract public class Shapes {
    private static int numShapes = 0;
    private int id;

    public Shapes(int numShapes, int id) {
        this.numShapes++;
        this.id = id;
    }

    public int getNumShapes() {
        return numShapes;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "numShapes=" + numShapes +
                ", id=" + id +
                '}';
    }
    abstract double getVolume();
    abstract double getSurface();
    abstract String getShapeType();

}
