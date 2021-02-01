package exceptionclass.bank2;

public class Account {

    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number is null");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        if (maxSubtract < 0) {
            throw new InvalidAmountBankOperationException("Invalid maxSubtract");
        }
        this.maxSubtract = maxSubtract;
    }

    public double subtract(double amount) {
        if (amount < 0) {
            throw new InvalidAmountBankOperationException("Invalid amount");
        }
        if (balance >= amount && amount <= maxSubtract) {
            balance -= amount;
        } else {
            throw new LowBalanceBankOperationException("Low balance");
        }
        return balance;
    }

    public double deposit(double amount) {
        if (amount < 0) {
            throw new InvalidAmountBankOperationException("Invalid amount");
        }
        return balance += amount;
    }
}
