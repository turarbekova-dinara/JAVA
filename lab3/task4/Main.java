package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("Alice", 5000, new Date(), "INS123");
        Employee e2 = new Employee("Bob", 6000, new Date(), "INS456");

        Manager m1 = new Manager("Charlie", 8000, new Date(), "INS789", 2000);
        m1.addEmployee(e1);
        m1.addEmployee(e2);

        System.out.println(e1);
        System.out.println(m1);

        // Comparable test
        System.out.println(e1.compareTo(e2));

        // Comparator test
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        Collections.sort(list, new NameComparator());
        System.out.println("Sorted by name: " + list);

        // Clone test
        Employee e3 = e1.clone();
        System.out.println("Cloned: " + e3);
    }
}