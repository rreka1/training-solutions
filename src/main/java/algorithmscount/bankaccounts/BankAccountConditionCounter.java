package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int balance) {
        int counter = 0;
        for(BankAccount bankAccount : bankAccounts) {
            if(bankAccount.getBalance() > balance) {
                counter++;
            }
        }
        return counter;
    }
}
