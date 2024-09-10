package dependency.injection.withdi;

public class ServiceMock implements Service {
    @Override
    public String execute() {
        // Mockando a execução com um retorno fixo para conseguir testar e fazer assertivas do que está sendo inserido no controller.
        return "execution_id";
    }
}
