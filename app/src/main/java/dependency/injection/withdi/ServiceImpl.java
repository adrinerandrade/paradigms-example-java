package dependency.injection.withdi;

import java.util.Random;

public class ServiceImpl implements Service {

    private final Random rn = new Random();

    @Override
    public String execute() {
        String executionId = rn.nextInt(1000) + "";
        System.out.println("Executed operation: " + executionId);
        return executionId;
    }

}
