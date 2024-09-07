package paradigms.demonstration.oo;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private final Map<String, Customer> customers; // Store customers by name

    // Constructor
    public Bank() {
        this.customers = new HashMap<>();
    }

    // Add a new customer to the bank
    public void addCustomer(Customer customer) {
        this.customers.put(customer.getName(), customer);
    }

    // Get a customer by name
    public Customer getCustomer(String name) {
        return customers.get(name);
    }

    // Display all customers' account balances
    public void showCustomerBalances() {
        for (Customer customer : customers.values()) {
            System.out.println("Customer: " + customer.getName());
            for (BankAccount account : customer.getAccounts()) {
                System.out.println("  Account " + account.getAccountNumber() + ": " + account.getBalance());
            }
        }
    }

}
