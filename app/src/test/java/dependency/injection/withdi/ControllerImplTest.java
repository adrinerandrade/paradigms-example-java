package dependency.injection.withdi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ControllerImplTest {

    private final Service service = new ServiceMock();

    @Test
    void test() {
        ControllerImpl controller = new ControllerImpl(service);
        controller.register();

        List<String> executionHistory = controller.getExecutionHistory();
        Assertions.assertEquals(1, executionHistory.size());
        Assertions.assertEquals("execution_id", executionHistory.get(0));
    }


}