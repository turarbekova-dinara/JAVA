package lab1.task3;

public class TemperatureTest {

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

