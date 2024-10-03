package reflection.exercicio;

public class ObjectWithInjectionImpl implements ObjectWithInjection {

    @CustomInjection
    private MyBean toInject;

    @Override
    @LogExecution
    public void logMyBean() {
        System.out.println(toInject);
    }

}
