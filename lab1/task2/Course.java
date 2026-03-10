package lab1.task2;

enum Level {
    BACHELOR,
    MASTER,
    PHD
}

public class Course {

    // static non-final field
    private static int totalCourses = 0;

    // final non-static field
    private final String courseCode;

    private String courseName;
    private int credits;
    private Level level;

    // initialization block
    {
        credits = 3; // default credits
    }

    // Constructor 1
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.level = Level.BACHELOR;
        totalCourses++;
    }

    // Constructor 2 (overloaded)
    public Course(String courseCode, String courseName, int credits, Level level) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.level = level;
        totalCourses++;
    }

    // method overloading
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setCredits(int lectures, int labs) {
        this.credits = lectures + labs;
    }

    public static int getTotalCourses() {
        return totalCourses;
    }

    @Override
    public String toString() {
        return "Course code: " + courseCode +
                ", Name: " + courseName +
                ", Credits: " + credits +
                ", Level: " + level;
    }
}

