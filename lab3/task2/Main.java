package task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bird bird = new Bird();
        Airplane plane = new Airplane();

        car.move();

        bird.move();
        bird.fly();

        plane.move();
        plane.fly();
    }
}
