package lab2.task4;

public class Parallel extends Circuit {

    private Circuit c1;
    private Circuit c2;
    private double potentialDiff;

    public Parallel(Circuit a, Circuit b){
        c1 = a;
        c2 = b;
    }

    @Override
    public double getResistance(){

        return 1 / (1/c1.getResistance() + 1/c2.getResistance());

    }

    @Override
    public double getPotentialDiff(){
        return potentialDiff;
    }

    @Override
    public void applyPotentialDiff(double V){

        potentialDiff = V;

        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);

    }

}
