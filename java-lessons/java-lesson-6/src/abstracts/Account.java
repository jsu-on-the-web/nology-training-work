package src.abstracts;

public abstract class Account {
    double balance;

    public double getBalance() {
        return balance;
    }

    abstract public double getInterestRate();

    // We can have methods with implementations if their functionality is the same across all derived classes
    public double getBalanceAfterYears(int years) {
        return balance * Math.pow(1 + getInterestRate(), years);

        // for (int i = 0; i < years; i++) {
        //     balance += balance * this.getInterestRate();
        // }

        // return this.balance;
    }

    public void printBalance() {
        System.out.println("The balance is " + this.getBalance() + " dollars.");
    }

}
