package reflection.exercicio;

public class BeanFactoryExample {

    public static void main(String[] args) {
        ObjectWithInjection objectWithInjection = BeanFactory.create(ObjectWithInjection.class, ObjectWithInjectionImpl.class);

        objectWithInjection.logMyBean();
    }

}
