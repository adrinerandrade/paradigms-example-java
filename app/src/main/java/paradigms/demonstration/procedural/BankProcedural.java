package paradigms.demonstration.procedural;

public class BankProcedural {

    public static String[] accountNumbers = new String[10];  // Fixed size of 10
    public static double[] accountBalances = new double[10]; // Fixed size of 10

    public static void main(String[] args) {
        // Initialize accounts (simulating the initial data in a COBOL table)
        accountNumbers[0] = "A123";
        accountBalances[0] = 1000.0;

        accountNumbers[1] = "A124";
        accountBalances[1] = 2000.0;

        accountNumbers[2] = "B123";
        accountBalances[2] = 1500.0;

        // Show account balances
        showBalances();

        // Perform transactions
        deposit("A123", 500.0);
        withdraw("B123", 300.0);

        // Show account balances
        showBalances();
    }

    // Deposit function simulating a COBOL procedure
    public static void deposit(String accountNumber, double amount) {
        for (int i = 0; i < accountNumbers.length; i++) {
            if (accountNumbers[i] != null && accountNumbers[i].equals(accountNumber)) {
                accountBalances[i] += amount;
                System.out.println("Depositing " + amount + " to account " + accountNumber);
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found.");
    }

    // Withdraw function simulating a COBOL procedure
    public static void withdraw(String accountNumber, double amount) {
        for (int i = 0; i < accountNumbers.length; i++) {
            if (accountNumbers[i] != null && accountNumbers[i].equals(accountNumber)) {
                if (accountBalances[i] >= amount) {
                    accountBalances[i] -= amount;
                    System.out.println("Withdrawing " + amount + " from account " + accountNumber);
                } else {
                    System.out.println("Insufficient funds in account " + accountNumber);
                }
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found.");
    }

    // Display account balances
    public static void showBalances() {
        for (int i = 0; i < accountNumbers.length; i++) {
            if (accountNumbers[i] != null) {
                System.out.println("Account " + accountNumbers[i] + ": " + accountBalances[i]);
            }
        }
    }
}