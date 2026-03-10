package lab2.task5;

public abstract class Person {

    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet){
        this.pet = pet;
    }

    public void removePet(){
        pet = null;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public abstract String getOccupation();

    @Override
    public String toString(){

        String petInfo = (pet == null) ? "No pet" : pet.toString();

        return name + " (" + getOccupation() + ") Pet: " + petInfo;
    }
}
