package lab1.task2;

public class Cat {

    // ENUM
    public enum Mood {
        HAPPY,
        HUNGRY,
        SLEEPY
    }

    // static non-final field (барлық мысық саны)
    private static int totalCats = 0;
    // final non-static field (read-only)
    private final int catId;
    // normal fields
    private String name;
    private Mood mood;
    private int energy;

    // initialization block
    {
        System.out.println("A new cat is being created...");
    }

    // constructor
    public Cat(String name, Mood mood) {
        this.name = name;   // this #1
        this.mood = mood;
        this.energy = 100;

        totalCats++;
        this.catId = totalCats;
    }

    // method overloading
    public void feed() {
        System.out.println(name + " eats normal food.");
    }

    public void feed(int foodAmount) {
        this.energy += foodAmount;
        System.out.println(name + " eats and gains energy: " + foodAmount);
        this.showEnergy();  // this #2
    }

    // normal method
    public void play(int minutes) {
        energy -= minutes;
        System.out.println(name + " plays for " + minutes + " minutes.");
    }

    public void showEnergy() {
        System.out.println("Energy: " + energy);
    }

    // static method
    public static int getTotalCats() {
        return totalCats;
    }

    // getters (read-only access)
    public int getCatId() {
        return catId;
    }

    public Mood getMood() {
        return mood;
    }
}

