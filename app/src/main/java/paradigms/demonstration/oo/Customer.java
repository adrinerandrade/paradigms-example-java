package paradigms.demonstration.oo;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String name;
    private final List<BankAccount> accounts;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to add a new bank account
    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }

    // Get the customer's name
    public String getName() {
        return name;
    }

    // Get the list of accounts
    public List<BankAccount> getAccounts() {
        return accounts;
    }

}

