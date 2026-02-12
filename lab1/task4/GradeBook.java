package lab1.task4;

import practice2.Student;

public class GradeBook {

    private Course course;
    private int[] grades;

    public GradeBook(Course course, Student[] students) {
        this.course = course;
        this.grades = new int[students.length];
    }

    public void setGrade(int index, int grade) {
        grades[index] = grade;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for:");
        System.out.println(course);
        System.out.println();
    }

    public double determineClassAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public int minimum() {
        int min = grades[0];
        for (int grade : grades) {
            if (grade < min)
                min = grade;
        }
        return min;
    }

    public int maximum() {
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max)
                max = grade;
        }
        return max;
    }

    public void outputBarChart() {

        System.out.println("\nGrade distribution:");

        int[] frequency = new int[11];

        for (int grade : grades)
            frequency[grade / 10]++;

        for (int i = 0; i < frequency.length; i++) {

            if (i == 10)
                System.out.print("100: ");
            else
                System.out.print(i * 10 + "-" + (i * 10 + 9) + ": ");

            for (int stars = 0; stars < frequency[i]; stars++)
                System.out.print("*");

            System.out.println();
        }
    }

    public void displayGradeReport() {

        System.out.println("Class average is: " + determineClassAverage());
        System.out.println("Lowest grade is: " + minimum());
        System.out.println("Highest grade is: " + maximum());
        outputBarChart();
    }
}

