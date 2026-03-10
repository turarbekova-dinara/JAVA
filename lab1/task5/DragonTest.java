package lab1.task5;

public class DragonTest {

    public static void main(String[] args) {

<<<<<<< HEAD
        DragonLaunch dragon = new DragonLaunch();

        dragon.kidnap(new Person("A", Gender.BOY));
        dragon.kidnap(new Person("B", Gender.GIRL));
        dragon.kidnap(new Person("C", Gender.BOY));
        dragon.kidnap(new Person("D", Gender.BOY));

        dragon.printPrisoners();

        if (dragon.willDragonEatOrNot()) {
            System.out.println("Dragon will eat!");
        } else {
            System.out.println("No lunch for dragon.");
=======
        DragonLaunch dl = new DragonLaunch();

        dl.kidnap(new Person("A", Gender.BOY));
        dl.kidnap(new Person("B", Gender.BOY));
        dl.kidnap(new Person("C", Gender.GIRL));
        dl.kidnap(new Person("D", Gender.GIRL));

        if (dl.willDragonEatOrNot()) {
            System.out.println("Dragon will eat!");
        } else {
            System.out.println("No launch today.");
>>>>>>> def40efe34b137167dde4a369f7afff656261491
        }
    }
}
