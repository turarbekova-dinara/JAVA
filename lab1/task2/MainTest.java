package lab1.task2;

public class MainTest {

    public static void main(String[] args) {

        Course c1 = new Course("CS101", "OOP");
        Course c2 = new Course("CS202", "Data Structures", 5, Level.MASTER);

        c1.setCredits(4);
        c2.setCredits(2, 3);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Total courses created: " + Course.getTotalCourses());
    }
}

