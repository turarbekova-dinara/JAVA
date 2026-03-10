package lab1.task2;

public class TestCat {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Murka", Cat.Mood.HAPPY);
        cat1.feed(20);
        cat1.play(10);
        System.out.println("Cat ID: " + cat1.getCatId());
        System.out.println("Total cats: " + Cat.getTotalCats());

        System.out.println("------");

        Cat cat2 = new Cat("Mosi", Cat.Mood.SLEEPY);
        cat2.feed();
        cat2.play(5);
        System.out.println("Cat ID: " + cat2.getCatId());
        System.out.println("Total cats: " + Cat.getTotalCats());
    }
}
