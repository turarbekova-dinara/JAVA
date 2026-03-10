package lab1.task1;

public class Data {

<<<<<<< HEAD
    private double sum;      
    private double max;      
    private int count;      

    public Data() {
        sum = 0;
        count = 0;
        max = Double.NEGATIVE_INFINITY;
=======
    private double sum;
    private double max;
    private int count;

    public Data() {
        sum = 0;
        max = Double.NEGATIVE_INFINITY;
        count = 0;
>>>>>>> def40efe34b137167dde4a369f7afff656261491
    }

    public void add(double value) {
        sum += value;
<<<<<<< HEAD
        count++;
=======
>>>>>>> def40efe34b137167dde4a369f7afff656261491

        if (value > max) {
            max = value;
        }
<<<<<<< HEAD
    }

    public double getAverage() {
=======

        count++;
    }

    public double average() {
>>>>>>> def40efe34b137167dde4a369f7afff656261491
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

<<<<<<< HEAD
    public double getMaximum() {
=======
    public double max() {
>>>>>>> def40efe34b137167dde4a369f7afff656261491
        if (count == 0) {
            return 0;
        }
        return max;
    }
}
<<<<<<< HEAD
=======

>>>>>>> def40efe34b137167dde4a369f7afff656261491
