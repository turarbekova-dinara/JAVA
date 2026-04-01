package task5;

public class Test {
    public static void main(String[] args) {

        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Mars", 30),
                new Chocolate("Snickers", 70)
        };

        Time[] times = {
                new Time(12, 30, 0),
                new Time(9, 15, 10),
                new Time(18, 5, 45)
        };

        System.out.println("Before sorting chocolates:");
        for (Chocolate c : chocolates)
            System.out.println(c);

        Sort.bubbleSort(chocolates);

        System.out.println("\nAfter sorting chocolates:");
        for (Chocolate c : chocolates)
            System.out.println(c);


        System.out.println("\nBefore sorting times:");
        for (Time t : times)
            System.out.println(t);

        Sort.mergeSort(times);

        System.out.println("\nAfter sorting times:");
        for (Time t : times)
            System.out.println(t);
    }
}
