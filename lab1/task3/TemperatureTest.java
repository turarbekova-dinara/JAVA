package lab1.task3;

public class TemperatureTest {
<<<<<<< HEAD
    public static void main(String[] args) {

        Temperature t1 = new Temperature();           // 0 C
        Temperature t2 = new Temperature(100);        // 100 C
        Temperature t3 = new Temperature('F');        // 0 F
        Temperature t4 = new Temperature(32, 'F');    // 32 F

        System.out.println("t1 in F: " + t1.getFahrenheit());
        System.out.println("t2 in F: " + t2.getFahrenheit());
        System.out.println("t3 in C: " + t3.getCelsius());
        System.out.println("t4 in C: " + t4.getCelsius());

        // Setter test
        t1.setTemperature(25, 'C');
        System.out.println("New t1 in F: " + t1.getFahrenheit());
    }
}
=======

    public static void main(String[] args) {

        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(25);
        Temperature t3 = new Temperature('F');
        Temperature t4 = new Temperature(100, 'F');

        System.out.println(t1 + " -> " + t1.getFahrenheit() + "°F");
        System.out.println(t2 + " -> " + t2.getFahrenheit() + "°F");
        System.out.println(t3 + " -> " + t3.getCelsius() + "°C");
        System.out.println(t4 + " -> " + t4.getCelsius() + "°C");
    }
}

>>>>>>> def40efe34b137167dde4a369f7afff656261491
