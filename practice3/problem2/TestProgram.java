package practice3.problem2;

import java.util.Scanner;
import java.util.Vector;

public class TestProgram {

    public static void main(String[] args) {

        Vector<Person> people = new Vector<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Person");
            System.out.println("2. Add Student");
            System.out.println("3. Add Staff");
            System.out.println("4. Print All");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Address: ");
                String addr = sc.nextLine();

                people.add(new Person(name, addr));
            }

            else if (choice == 2) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Address: ");
                String addr = sc.nextLine();
                System.out.print("Program: ");
                String program = sc.nextLine();
                System.out.print("Year: ");
                int year = sc.nextInt();
                System.out.print("Fee: ");
                double fee = sc.nextDouble();

                people.add(new Student(name, addr, program, year, fee));
            }

            else if (choice == 3) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Address: ");
                String addr = sc.nextLine();
                System.out.print("School: ");
                String school = sc.nextLine();
                System.out.print("Pay: ");
                double pay = sc.nextDouble();

                people.add(new Staff(name, addr, school, pay));
            }

            else if (choice == 4) {
                for (Person p : people) {
                    System.out.println(p);
                }
            }

            else if (choice == 5) {
                break;
            }
        }

        sc.close();
    }
}

