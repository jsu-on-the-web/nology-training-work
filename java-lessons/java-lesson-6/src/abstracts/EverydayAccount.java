package src.abstracts;

public class EverydayAccount extends Account {
    
    public EverydayAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }
}
