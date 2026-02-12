package lab1.task4;

import practice2.Student;
import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {

        Course course = new Course(
                "CS101",
                "Object-Oriented Programming",
                5
        );

        Student[] students = {
                new Student("A", 1),
                new Student("B", 2),
                new Student("C", 3),
                new Student("D", 4),
                new Student("E", 5)
        };

        GradeBook gb = new GradeBook(course, students);

        Scanner sc = new Scanner(System.in);

        gb.displayMessage();

        for (int i = 0; i < students.length; i++) {

            System.out.print("Enter grade for " + students[i].getName() + ": ");
            int grade = sc.nextInt();

            gb.setGrade(i, grade);
        }

        gb.displayGradeReport();

        sc.close();
    }
}
