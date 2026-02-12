package lab1.task5;

public class DragonTest {

    public static void main(String[] args) {

        DragonLaunch dl = new DragonLaunch();

        dl.kidnap(new Person("A", Gender.BOY));
        dl.kidnap(new Person("B", Gender.BOY));
        dl.kidnap(new Person("C", Gender.GIRL));
        dl.kidnap(new Person("D", Gender.GIRL));

        if (dl.willDragonEatOrNot()) {
            System.out.println("Dragon will eat!");
        } else {
            System.out.println("No launch today.");
        }
    }
}
