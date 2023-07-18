package src.abstracts;

public class AbstractMain {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(1000);
        sa.printBalance();
        System.out.println(sa.getBalanceAfterYears(5));

        EverydayAccount ea = new EverydayAccount(500);
        ea.printBalance();
        System.out.println(ea.getBalanceAfterYears(5));

    }
}
