package lab1.task3;

public class Temperature {

    private double value;
    private char scale; // 'C' or 'F'

    // 1️⃣ Default constructor (0 Celsius)
    public Temperature() {
        this.value = 0;
        this.scale = 'C';
    }

    // 2️⃣ Constructor with value only (assume Celsius)
    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

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
    public double getCelsius() {
        if (scale == 'C') {
            return value;
        } else {
            return 5 * (value - 32) / 9;
        }
    }

    // Return Fahrenheit
    public double getFahrenheit() {
        if (scale == 'F') {
            return value;
        } else {
            return 9 * value / 5 + 32;
        }
    }

    // Set value
    public void setValue(double value) {
        this.value = value;
    }

    // Set scale
    public void setScale(char scale) {
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            System.out.println("Invalid scale! Using Celsius.");
            this.scale = 'C';
        }
    }

    // Set both
    public void setBoth(double value, char scale) {
        this.value = value;
        setScale(scale);
    }

    // Return scale
    public char getScale() {
        return scale;
    }

    @Override
    public String toString() {
        return value + "°" + scale;
    }
}
