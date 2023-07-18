package src.abstracts;

public class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getInterestRate() {
        return 0.05;
    }
}
