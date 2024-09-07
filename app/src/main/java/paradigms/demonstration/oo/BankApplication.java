package paradigms.demonstration.oo;

public class BankApplication {

    public static void main(String[] args) {
        // Create a new bank
        Bank bank = new Bank();

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Create accounts for customers
        BankAccount aliceAccount1 = new BankAccount("A123", 1000.0);
        BankAccount aliceAccount2 = new BankAccount("A124", 2000.0);
        BankAccount bobAccount = new BankAccount("B123", 1500.0);

        // Add accounts to customers
        customer1.addAccount(aliceAccount1);
        customer1.addAccount(aliceAccount2);
        customer2.addAccount(bobAccount);

        // Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Perform some transactions
        aliceAccount1.deposit(500.0);  // Alice deposits into one of her accounts
        bobAccount.withdraw(300.0);    // Bob withdraws from his account

        // Show customer balances
        bank.showCustomerBalances();
    }
}
