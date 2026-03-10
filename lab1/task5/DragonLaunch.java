package lab1.task5;

import java.util.Vector;

public class DragonLaunch {

<<<<<<< HEAD
    private Vector<Person> prisoners = new Vector<>();

    // Kidnap method
    public void kidnap(Person p) {
        prisoners.add(p);
    }

    // Main logic
    public boolean willDragonEatOrNot() {

        int boysWaiting = 0;   // unmatched boys count

        for (Person p : prisoners) {

            if (p.getGender() == Gender.BOY) {
                boysWaiting++;
            }
            else { // girl

                if (boysWaiting > 0) {
                    // BG pair disappears
                    boysWaiting--;
                }
            }
        }
        
        return boysWaiting > 0;
    }

    public void printPrisoners() {
        System.out.println(prisoners);
    }
=======
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
>>>>>>> def40efe34b137167dde4a369f7afff656261491
}
