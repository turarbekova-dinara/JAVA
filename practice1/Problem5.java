public class Problem5 {
    public static void main(String[] args) {

        double balance = 100000;
        double interestRate = 0.10; // 10%

        double newBalance = balance + (balance * interestRate);

        System.out.println("Initial balance: " + balance);
        System.out.println("Interest rate: " + (interestRate * 100) + "%");
        System.out.println("New balance: " + newBalance);
    }
}

