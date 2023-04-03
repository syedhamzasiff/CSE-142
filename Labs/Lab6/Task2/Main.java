import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Shapes> shapes = new ArrayList<>();

        shapes.add(new Sphere(5, 100, 10));
        shapes.add(new Cuboid(5, 101, 10, 20, 34));
        shapes.add(new Cube(0, 1, 5));
        shapes.add(new Cylinder(1, 2, 34, 67));

        for (Shapes shapes1: shapes) {
            System.out.println(shapes1.getShapeType());
            System.out.println(shapes1.getVolume());
            System.out.println(shapes1.getSurface());
            System.out.println();
        }


    }
}