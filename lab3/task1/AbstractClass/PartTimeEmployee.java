package AbstractClass;

class PartTimeEmployee extends Employee {
    double hours;
    double rate;

    PartTimeEmployee(String name, double hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    double calculateSalary() {
        return hours * rate;
    }
}
