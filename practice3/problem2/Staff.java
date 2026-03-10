package practice3.problem2;

public class Staff extends Person {

    private String school;
    private double pay;

<<<<<<< HEAD
    public Staff(String name, String address, String school, double pay) {
=======
    public Staff(String name, String address,
                 String school, double pay) {
>>>>>>> def40efe34b137167dde4a369f7afff656261491
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Staff[" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
    }
}
=======
        return "Staff[" + super.toString()
                + ", school=" + school
                + ", pay=" + pay + "]";
    }
}

>>>>>>> def40efe34b137167dde4a369f7afff656261491
