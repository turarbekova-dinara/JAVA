<<<<<<< HEAD
package practice1;
=======
>>>>>>> def40efe34b137167dde4a369f7afff656261491

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score: ");
        int score = sc.nextInt();

        String grade;

        if (score >= 95) grade = "A";
        else if (score >= 90) grade = "A-";
        else if (score >= 85) grade = "B+";
        else if (score >= 80) grade = "B";
        else if (score >= 75) grade = "B-";
        else if (score >= 70) grade = "C+";
        else if (score >= 65) grade = "C";
        else if (score >= 60) grade = "C-";
        else if (score >= 50) grade = "D";
        else grade = "F";

        System.out.println("Grade: " + grade);

        sc.close();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> def40efe34b137167dde4a369f7afff656261491
