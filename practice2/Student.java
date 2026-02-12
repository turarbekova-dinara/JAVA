package practice2;

public class Student {

    private String name;
    private int id;
    private int year;

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
}

