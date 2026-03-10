package lab2.task5;

public class TestSystem {

    public static void main(String[] args){

        Person john = new Employee("John",30,"Engineer");
        Person alice = new PhDStudent("Alice",26,"CS","AI");

        Animal cat = new Cat("Murka",5);

        john.assignPet(cat);

        PersonRegistry registry = new PersonRegistry();

        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println(registry);

    }
}
