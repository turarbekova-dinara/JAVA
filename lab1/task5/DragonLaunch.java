package lab1.task5;

import java.util.Vector;

public class DragonLaunch {

    private Vector<Person> people;

    public DragonLaunch() {
        people = new Vector<>();
    }

    public void kidnap(Person p) {
        people.add(p);
    }

    public boolean willDragonEatOrNot() {

        int boysWaiting = 0;

        for (int i = 0; i < people.size(); i++) {

            if (people.get(i).getGender() == Gender.BOY) {
                boysWaiting++;
            } else { // GIRL
                if (boysWaiting > 0) {
                    boysWaiting--; // pair disappears
                } else {
                    boysWaiting++; // girl unmatched
                }
            }
        }

        return boysWaiting > 0;
    }
}
