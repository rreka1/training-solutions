package inheritancemethods.bankaccount;

public class DebitAccount {

    private String accountNumber;
    private long balance;
    private static final double COST = 3.0;
    private static final long MIN_COST = 200;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public final long costOfTransaction(long amount) {
        long cost = (long) (amount * COST / 100.0);
        if (cost >= MIN_COST) {
            return cost;
        }
        return MIN_COST;
    }

    public boolean transaction(long amount) {
        if (balance >= amount) {
            balance -= (amount + costOfTransaction(amount));
            return true;
        }
        return false;
    }

    public void balanceToZero() {
        balance = 0;
    }
}
