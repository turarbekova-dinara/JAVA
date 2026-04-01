package task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Ali", 3.2));
        list.add(new Student("Dana", 3.8));
        list.add(new Student("Bob", 2.9));

        // Sort by GPA
        Collections.sort(list);
        System.out.println("Sort by GPA:");
        System.out.println(list);

        // Sort by Name
        Collections.sort(list, new NameComparator());
        System.out.println("Sort by Name:");
        System.out.println(list);
    }
}
