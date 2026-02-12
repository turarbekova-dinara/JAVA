
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double a = sc.nextDouble();

        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = Math.sqrt(2) * a;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);

        sc.close();
    }
}