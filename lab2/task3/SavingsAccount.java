package lab2.task3;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int accNumber, double rate){
        super(accNumber);
        interestRate = rate;
    }

    public void addInterest(){

        double interest = getBalance() * interestRate / 100;

        deposit(interest);
    }

    @Override
    public void update(){
        addInterest();
    }

    @Override
    public String toString(){
        return "Savings " + super.toString();
    }
}
