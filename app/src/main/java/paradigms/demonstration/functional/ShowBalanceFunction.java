package paradigms.demonstration.functional;

import java.util.Map;

public class ShowBalanceFunction {

    public static void showBalances(Map<String, Double> accounts) {
        accounts.forEach((accountNumber, balance) ->
                System.out.println("Account " + accountNumber + ": " + balance)
        );
    }

}
