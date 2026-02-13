package practice3.problem1;

public class Animal {

    protected String name;
    protected int weight;

    // Constructor without parameters
    public Animal() {
        this.name = "Unknown";
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

