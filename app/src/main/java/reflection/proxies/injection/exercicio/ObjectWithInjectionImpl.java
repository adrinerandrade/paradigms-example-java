package reflection.proxies.injection.exercicio;

import reflection.annotations.CustomInjection;
import reflection.annotations.LogExecution;

public class ObjectWithInjectionImpl implements ObjectWithInjection {

    @CustomInjection
    private MyBean toInject;

    @Override
    @LogExecution
    public void logMyBean() {
        System.out.println(toInject);
    }

}
