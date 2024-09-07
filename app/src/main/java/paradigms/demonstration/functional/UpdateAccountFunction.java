package paradigms.demonstration.functional;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import static java.util.Collections.unmodifiableMap;

public class UpdateAccountFunction {

    // Higher-order function to update an account (avoiding direct mutation)
    public static Map<String, Double> updateAccount(Map<String, Double> accounts, String accountNumber,
                                                    BiFunction<Double, Double, Double> operation, double amount) {
        if (accounts.containsKey(accountNumber)) {
            Map<String, Double> updatedAccounts = new HashMap<>(accounts);  // Create a copy of the original map
            double currentBalance = accounts.get(accountNumber);
            double newBalance = operation.apply(currentBalance, amount);  // Apply the operation function
            updatedAccounts.put(accountNumber, newBalance);
            System.out.println("Updating account " + accountNumber + " with new balance: " + newBalance);
            return unmodifiableMap(updatedAccounts);  // Return the new immutable state (updated accounts map)
        } else {
            System.out.println("Account " + accountNumber + " not found.");
            return unmodifiableMap(accounts);  // Return the original map unchanged if the account is not found
        }
    }

}
