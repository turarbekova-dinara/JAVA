package practice3.problem1;

public class Animal {

    protected String name;
<<<<<<< HEAD
=======
    protected int weight;
>>>>>>> def40efe34b137167dde4a369f7afff656261491

    // Constructor without parameters
    public Animal() {
        this.name = "Unknown";
<<<<<<< HEAD
        System.out.println("Animal default constructor");
    }

    // Constructor with parameter
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor with name");
    }

    // Method to override
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Method to overload
    public void eat() {
        System.out.println(name + " is eating");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
}
=======
        this.weight = 0;
    }

    // Constructor with parameters
    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    // Method for overriding
    public String voice() {
        return "Undefined sound";
    }

    // Overloaded method
    public String voice(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += voice() + " ";
        }
        return result;
    }

    @Override
    public String toString() {
        return "Animal[name=" + name + ", weight=" + weight + "]";
    }
}

>>>>>>> def40efe34b137167dde4a369f7afff656261491
