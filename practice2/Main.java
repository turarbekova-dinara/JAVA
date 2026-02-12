package practice2;

public class Main {

    public static void main(String[] args) {

        // Student
        Student s = new Student("Dinara", 24032071);

        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("Year: " + s.getYear());

        s.nextYear();
        System.out.println("After next year: " + s.getYear());

        // StarTriangle
        StarTriangle small = new StarTriangle(3);
        System.out.println(small);

        // Time
        Time t1 = new Time(23, 5, 6);
        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandard());

        Time t2 = new Time(4, 24, 33);
        t1.add(t2);

        System.out.println("After adding:");
        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandard());
    }
}
