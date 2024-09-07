package paradigms.demonstration.functional;

import java.util.Map;

import static paradigms.demonstration.functional.UpdateAccountFunction.updateAccount;

public class WithdrawFunction {

    public static Map<String, Double> withdraw(Map<String, Double> accounts, String accountNumber, double amount) {
        return updateAccount(accounts, accountNumber, (balance, amt) -> {
            if (balance >= amt) {
                return balance - amt;
            } else {
                System.out.println("Insufficient funds in account " + accountNumber);
                return balance;
            }
        }, amount);
    }

}
