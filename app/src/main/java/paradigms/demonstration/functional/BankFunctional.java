package paradigms.demonstration.functional;

import java.util.Map;

import static paradigms.demonstration.functional.DepositFunction.deposit;
import static paradigms.demonstration.functional.ShowBalanceFunction.showBalances;
import static paradigms.demonstration.functional.WithdrawFunction.withdraw;

public class BankFunctional {

    public static void main(String[] args) {
        // Initial account balances (Immutable initial state)
        Map<String, Double> accounts = Map.of(
            "A123", 1000.0,
            "A124", 2000.0,
            "B123", 1500.0
        );

        // Display initial balances
        showBalances(accounts);

        // Apply deposit and withdrawal without changing the original accounts map
        accounts = deposit(accounts, "A123", 500.0);
        accounts = withdraw(accounts, "B123", 300.0);

        // Display final balances
        showBalances(accounts);
    }
}
