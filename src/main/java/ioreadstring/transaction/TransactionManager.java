package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private List<BankAccount> accountList = new ArrayList<>();

    public List<BankAccount> getAccountList() {
        return accountList;
    }

    public void uploadListFromFile(String filePath) {
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            for (String line : lines) {
                String[] accountData = line.split(";");
                String name = accountData[0];
                String accountNumber = accountData[1];
                int balance = Integer.parseInt(accountData[2]);
                accountList.add(new BankAccount(name, accountNumber, balance));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    public void makeTransactions(String filePath) {
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            for (String line : lines) {
                String[] transactionData = line.split(";");
                findAccount(transactionData[0]).setBalance(Integer.parseInt(transactionData[1]));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    private BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new IllegalArgumentException("Account not found");
    }
}
