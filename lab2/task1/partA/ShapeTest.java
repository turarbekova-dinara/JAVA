package lab2.task1.partA;

public class ShapeTest {

    public static void main(String[] args) {

        Cylinder c = new Cylinder(3,5);
        Sphere s = new Sphere(4);
        Cube cube = new Cube(2);

        System.out.println(c.volume());
        System.out.println(s.volume());
        System.out.println(cube.volume());

    }

}