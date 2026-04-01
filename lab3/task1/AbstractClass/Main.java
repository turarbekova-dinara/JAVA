package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Ali", 5000);
        Employee e2 = new PartTimeEmployee("Sara", 20, 15);

        e1.displayName();
        System.out.println(e1.calculateSalary());

        e2.displayName();
        System.out.println(e2.calculateSalary());
    }
}
