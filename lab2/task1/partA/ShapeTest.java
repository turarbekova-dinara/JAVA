package lab2.task1.partA;

public class ShapeTest {

    public static void main(String[] args) {

        Cylinder c = new Cylinder(3,5);
        Sphere s = new Sphere(4);
        Cube cube = new Cube(2);

        System.out.println("V = " + c.volume());
        System.out.println("V = " + s.volume());
        System.out.println("V = " + cube.volume());

        System.out.println();

        System.out.println("SA = " + c.surfaceArea());
        System.out.println("SA = " + s.surfaceArea());
        System.out.println("SA = " + cube.surfaceArea());
    }

}