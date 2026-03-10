package lab1.task3;

public class Temperature {

<<<<<<< HEAD
    // private fields (encapsulation)
    private double value;
    private char scale;  // 'C' or 'F'

    // 1 Default constructor (0 Celsius)
=======
    private double value;
    private char scale; // 'C' or 'F'

    // 1️⃣ Default constructor (0 Celsius)
>>>>>>> def40efe34b137167dde4a369f7afff656261491
    public Temperature() {
        this.value = 0;
        this.scale = 'C';
    }

<<<<<<< HEAD
    // 2 Constructor with value only (default scale = C)
=======
    // 2️⃣ Constructor with value only (assume Celsius)
>>>>>>> def40efe34b137167dde4a369f7afff656261491
    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

<<<<<<< HEAD
    // 3 Constructor with scale only (default value = 0)
    public Temperature(char scale) {
        this.value = 0;
        this.scale = scale;
    }

    // 4 Constructor with both parameters
    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    // 1 Method to return temperature in Celsius
=======
    // 3️⃣ Constructor with scale only (value = 0)
    public Temperature(char scale) {
        this.value = 0;
        setScale(scale);
    }

    // 4️⃣ Constructor with both parameters
    public Temperature(double value, char scale) {
        this.value = value;
        setScale(scale);
    }

    // Return Celsius
>>>>>>> def40efe34b137167dde4a369f7afff656261491
    public double getCelsius() {
        if (scale == 'C') {
            return value;
        } else {
            return 5 * (value - 32) / 9;
        }
    }

<<<<<<< HEAD
    // 2 Method to return temperature in Fahrenheit
=======
    // Return Fahrenheit
>>>>>>> def40efe34b137167dde4a369f7afff656261491
    public double getFahrenheit() {
        if (scale == 'F') {
            return value;
        } else {
<<<<<<< HEAD
            return 9 * (value / 5) + 32;
        }
    }

    // Set temperature value only
=======
            return 9 * value / 5 + 32;
        }
    }

    // Set value
>>>>>>> def40efe34b137167dde4a369f7afff656261491
    public void setValue(double value) {
        this.value = value;
    }

<<<<<<< HEAD
    // Set scale only
=======
    // Set scale
>>>>>>> def40efe34b137167dde4a369f7afff656261491
    public void setScale(char scale) {
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
<<<<<<< HEAD
            System.out.println("Invalid scale! Use 'C' or 'F'.");
        }
    }

    // Set both value and scale
    public void setTemperature(double value, char scale) {
=======
            System.out.println("Invalid scale! Using Celsius.");
            this.scale = 'C';
        }
    }

    // Set both
    public void setBoth(double value, char scale) {
>>>>>>> def40efe34b137167dde4a369f7afff656261491
        this.value = value;
        setScale(scale);
    }

    // Return scale
    public char getScale() {
        return scale;
    }
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        return value + "°" + scale;
    }
>>>>>>> def40efe34b137167dde4a369f7afff656261491
}
