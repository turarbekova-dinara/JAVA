import java.util.Scanner;

public class Problem6 {

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        if (isPalindrome(word)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is NOT a palindrome");
        }

        sc.close();
    }
}
