package practice3.problem1;

public class TestAnimals {
    public static void main(String[] args) {

        Animal a1 = new Animal("Generic", 10);
        Animal d1 = new Dog("Rex", 25, "Shepherd");

        System.out.println(a1);
        System.out.println(d1);

        // Polymorphism
        System.out.println(d1.voice());      // overridden
        System.out.println(d1.voice(3));     // overloaded

        // Casting example
        if (d1 instanceof Dog) {
            Dog dog = (Dog) d1;
            dog.findPedigree();
        }
    }
}

