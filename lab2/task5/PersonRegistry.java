package lab2.task5;

import java.util.ArrayList;

public class PersonRegistry {

    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person p){
        people.add(p);
    }

    public void removePerson(Person p){
        people.remove(p);
    }

    @Override
    public String toString(){

        String result = "";

        for(Person p : people){
            result += p.toString() + "\n";
        }

        return result;
    }
}