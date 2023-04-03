public class Cuboid extends Shapes{
    private double length;
    private double breadth;
    private double height;

    public Cuboid(int numShapes, int id, double length, double breadth, double height) {
        super(numShapes, id);
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getHeight() {
        return height;
    }

    @Override
    double getVolume() {
        return length * breadth * height;
    }

    @Override
    double getSurface() {
        return 2 * ((length*breadth)+(breadth*height)+(height*length));
    }

    @Override
    String getShapeType() {
        return "Cuboid";
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", height=" + height +
                '}';
    }
}
