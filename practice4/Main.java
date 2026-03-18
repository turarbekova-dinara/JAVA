public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        Cat cat = new Cat("Black");
        Student student = new Student("Dinara", 18, "KBTU");
        Teacher teacher = new Teacher("John", 35, "Math");

        restaurant.servePizza(cat);
        restaurant.servePizza(student);
        restaurant.servePizza(teacher);
    }
}