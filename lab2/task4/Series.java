package lab2.task4;

public class Series extends Circuit {

    private Circuit c1;
    private Circuit c2;
    private double potentialDiff;

    public Series(Circuit a, Circuit b){
        c1 = a;
        c2 = b;
    }

    @Override
    public double getResistance(){
        return c1.getResistance() + c2.getResistance();
    }

    @Override
    public double getPotentialDiff(){
        return potentialDiff;
    }

    @Override
    public void applyPotentialDiff(double V){

        potentialDiff = V;

        double current = V / getResistance();

        c1.applyPotentialDiff(current * c1.getResistance());
        c2.applyPotentialDiff(current * c2.getResistance());

    }

}
