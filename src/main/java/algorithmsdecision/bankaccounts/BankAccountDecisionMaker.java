package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int amount) {
        for(BankAccount bankAccount : accounts) {
            if(bankAccount.getBalance() > amount) {
                return true;
            }
        }
        return false;
    }
}
