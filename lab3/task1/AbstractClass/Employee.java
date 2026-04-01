package AbstractClass;

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Employee name: " + name);
    }

    abstract double calculateSalary();
}
