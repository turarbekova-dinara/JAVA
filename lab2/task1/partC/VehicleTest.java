package lab2.task1.partC;

import java.util.HashSet;

public class VehicleTest {

    public static void main(String[] args){

        HashSet<Car> cars = new HashSet<>();

        cars.add(new Car("Toyota",2020,"Camry"));
        cars.add(new Car("Toyota",2020,"Camry"));
        cars.add(new Car("BMW",2022,"M5"));

        System.out.println(cars.size());
    }
}
