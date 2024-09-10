package dependency.injection.withdi;

import java.util.ArrayList;
import java.util.List;

public class ControllerImpl implements Controller {

    private final List<String> history = new ArrayList<>();
    private final Service service;

    public ControllerImpl(Service service) {
        this.service = service;
    }

    @Override
    public long register() {
        history.add(service.execute());
        return history.size();
    }

    @Override
    public List<String> getExecutionHistory() {
        return history;
    }

}
