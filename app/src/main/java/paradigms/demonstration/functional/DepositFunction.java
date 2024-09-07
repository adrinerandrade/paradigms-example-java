package paradigms.demonstration.functional;

import java.util.Map;

import static paradigms.demonstration.functional.UpdateAccountFunction.updateAccount;

public class DepositFunction {

    public static Map<String, Double> deposit(Map<String, Double> accounts, String accountNumber, double amount) {
        return updateAccount(accounts, accountNumber, (balance, amt) -> balance + amt, amount);
    }

}
