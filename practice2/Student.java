package practice2;

public class Student {

    private String name;
    private int id;
    private int year;
<<<<<<< HEAD
    private int grade;
=======
>>>>>>> def40efe34b137167dde4a369f7afff656261491

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.year = 1; // default first year
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void nextYear() {
        year++;
    }
<<<<<<< HEAD

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " (id: " + id + ", grade: " + grade + ")";
    }
    
}
=======
}

>>>>>>> def40efe34b137167dde4a369f7afff656261491
