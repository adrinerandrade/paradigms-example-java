package reflection.exercicio;

public class BeanFactoryExample {

    public static void main(String[] args) {
        ObjectWithInjectionImpl objectWithInjection1 = new ObjectWithInjectionImpl();
        ObjectWithInjection objectWithInjection = BeanFactory.create(ObjectWithInjection.class);

        objectWithInjection.logMyBean();
        objectWithInjection1.logMyBean();
    }

}
