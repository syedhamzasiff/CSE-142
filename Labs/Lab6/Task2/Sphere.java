public class Sphere extends Shapes{
    private double radius;

    public Sphere(int numShapes, int id, double radius) {
        super(numShapes, id);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double getVolume() {
        double volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
        return volume;
    }

    @Override
    double getSurface() {
        return radius * 4 * Math.PI;
    }

    @Override
    String getShapeType() {
        return "Sphere";
    }

    @Override
    public String toString() {
        return super.toString()+ "Sphere{" +
                "radius=" + radius +
                '}';
    }
}
