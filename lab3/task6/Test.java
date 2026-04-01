package task6;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person p1 = new Person("Alice", 25, 3000);
        Person p2 = new Person("Bob", 30, 4000);

        System.out.println(p1.compareTo(p2)); // age compare
        System.out.println(p1.getPaymentAmount());

        Person clonePerson = (Person) p1.clone();
        System.out.println("Clone: " + clonePerson);

        Pet pet1 = new Pet("Cat", 4.5);
        Pet pet2 = new Pet("Dog", 10.2);

        pet1.feed();

        Pet clonePet = (Pet) pet1.clone();
        System.out.println("Clone pet: " + clonePet);
    }
}
