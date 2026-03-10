package lab1.task1;

import java.util.Scanner;

public class Analyzer {
<<<<<<< HEAD
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = scanner.nextLine();
=======

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Data data = new Data();

        while (true) {

            System.out.print("Enter number (Q to quit): ");
            String input = sc.nextLine();
>>>>>>> def40efe34b137167dde4a369f7afff656261491

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

<<<<<<< HEAD
            double number = Double.parseDouble(input);
            data.add(number);
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());

        scanner.close();
    }
}
=======
            try {
                double value = Double.parseDouble(input);
                data.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number or Q.");
            }
        }

        System.out.println("Average = " + data.average());
        System.out.println("Maximum = " + data.max());

        sc.close();
    }
}

>>>>>>> def40efe34b137167dde4a369f7afff656261491
