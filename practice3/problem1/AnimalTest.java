package practice3.problem1;

public class AnimalTest {

    public static void main(String[] args) {

        Animal a = new Animal("Generic Animal");
        a.makeSound();
        a.eat("food");

        System.out.println("-------------");

        Cat c1 = new Cat();
        c1.makeSound();

        System.out.println("-------------");

        Cat c2 = new Cat("Tom");
        c2.makeSound();          // overriding
        c2.makeSound(3);         // overloading
        c2.eat("fish");          // inherited method
    }
}

