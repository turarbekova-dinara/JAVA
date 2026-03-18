class Teacher extends Person implements CanHavePizza {

    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void eatPizza() {
        System.out.println("Teacher " + name + " (" + subject + ") is eating pizza 🍕");
    }
}