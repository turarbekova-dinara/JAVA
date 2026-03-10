package lab2.task1.partC;

import java.util.Objects;

public class Car extends Vehicle {

    private String model;

    public Car(String brand, int year, String model){
        super(brand, year);
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    @Override
    public boolean equals(Object o){

        if(this == o) return true;
        if(!(o instanceof Car)) return false;

        Car car = (Car) o;

        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode(){
        return Objects.hash(model);
    }
}
