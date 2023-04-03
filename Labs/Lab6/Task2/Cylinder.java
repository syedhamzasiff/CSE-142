public class Cylinder extends Shapes{
    private double height;
    private double radius;

    public Cylinder(int numShapes, int id, double height, double radius) {
        super(numShapes, id);
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }

    @Override
    double getVolume() {
        return height * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getSurface() {
        return 2 * Math.PI * radius * (radius+height);
    }

    @Override
    String getShapeType() {
        return "Cylinder";
    }
}
