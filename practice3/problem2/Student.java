package practice3.problem2;

public class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address,
                   String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}
=======
        return "Student[" + super.toString()
                + ", program=" + program
                + ", year=" + year
                + ", fee=" + fee + "]";
    }
}

>>>>>>> def40efe34b137167dde4a369f7afff656261491
