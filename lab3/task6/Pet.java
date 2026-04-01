package task6;

public class Pet implements Comparable<Pet>, Cloneable, Feedable {
    private String name;
    private double weight;

    public Pet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Pet other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void feed() {
        System.out.println(name + " is eating...");
    }

    @Override
    public String toString() {
        return name + " " + weight;
    }
}
