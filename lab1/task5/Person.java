package lab1.task5;

public class Person {

<<<<<<< HEAD
    private String name;
    private Gender gender;
=======
    private Gender gender;
    private String name;
>>>>>>> def40efe34b137167dde4a369f7afff656261491

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ")";
    }
}
