package task3;

class Student implements Comparable<Student> {
    String name;
    double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa);
    }

    public String toString() {
        return name + " " + gpa;
    }
}
