package task4;

import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee implements Cloneable {
    private Vector<Employee> team;
    private double bonus;

    public Manager() {
        team = new Vector<>();
    }

    public Manager(String name, double salary, java.util.Date hireDate,
                   String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        team = new Vector<>();
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Bonus: " + bonus +
                ", Team size: " + team.size();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Manager m = (Manager) o;
        return Double.compare(bonus, m.bonus) == 0 &&
                Objects.equals(team, m.team);
    }

    @Override
    public int compareTo(Employee other) {
        if (other instanceof Manager) {
            Manager m = (Manager) other;
            int salaryCompare = Double.compare(this.getSalary(), m.getSalary());
            if (salaryCompare == 0) {
                return Double.compare(this.bonus, m.bonus);
            }
            return salaryCompare;
        }
        return super.compareTo(other);
    }

    @Override
    public Manager clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.team = new Vector<>(team); // shallow copy team
        return cloned;
    }
}