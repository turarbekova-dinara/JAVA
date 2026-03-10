package practice3.problem1;

public class Cat extends Animal {

    // super() without parameters
    public Cat() {
        super();
        System.out.println("Cat default constructor");
    }

    // super() with parameter
    public Cat(String name) {
        super(name);
        System.out.println("Cat constructor with name");
    }

    // overriding
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    // overloading
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(name + " says: Meow!");
        }
    }
}
