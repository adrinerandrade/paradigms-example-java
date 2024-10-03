package reflection.exercicio;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

public class BeanFactory {

    public static <T, R extends T> T create(Class<T> interfaceClazz, Class<R> implementationClass) {
        R instance;
        try {
            instance = implementationClass.newInstance();
            for (Field declaredField : implementationClass.getDeclaredFields()) {
                boolean inject = declaredField.getDeclaredAnnotation(CustomInjection.class) != null;
                if (inject) {
                    Class<?> type = declaredField.getType();
                    declaredField.setAccessible(true);
                    Object toInject = ServiceLocator.getInstance(type);
                    if (toInject == null) {
                        throw new IllegalStateException("Type " + type + " does not have a bean to inject.");
                    }
                    declaredField.set(instance, toInject);
                }
            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalArgumentException("The implementation class need to have a no constructor argument");
        }
        return (T) Proxy.newProxyInstance(
                interfaceClazz.getClassLoader(),
                new Class<?>[] { interfaceClazz },
                new LoggingInvocationHandler(instance)
        );
    }
    
}
