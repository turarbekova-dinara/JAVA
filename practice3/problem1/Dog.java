package practice3.problem1;

public class Dog extends Animal {

    private String breed;

    // Constructor using super() without parameters
    public Dog() {
        super();
        this.breed = "Unknown";
    }

    // Constructor using super(parameters)
    public Dog(String name, int weight, String breed) {
        super(name, weight);
        this.breed = breed;
    }

    // OVERRIDING
    @Override
    public String voice() {
        return "Woof";
    }

    // New method (not in parent)
    public void findPedigree() {
        System.out.println("Pedigree found!");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + ", breed=" + breed + "]";
    }
}

