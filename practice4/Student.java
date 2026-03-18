class Student extends Person implements CanHavePizza {

    String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public void eatPizza() {
        System.out.println(name + " from " + university + " is eating pizza 🍕");
    }
}
