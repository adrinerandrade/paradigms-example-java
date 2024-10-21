package reflection.exercicio;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.List;

public class BeanFactory {

    public static <T> T create(Class<T> interfaceClazz) {
        T instance;
        try {
            Class<? extends T> implementationClass = getImplementationClass(interfaceClazz);
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

    private static <T> Class<? extends T> getImplementationClass(Class<T> interfaceClazz) {
        try {
            List<Class<? extends T>> implementations = InterfaceImplementationLocator.findImplementations(interfaceClazz, "reflection.exercicio");
            if (implementations == null || implementations.isEmpty()) {
                throw new IllegalArgumentException("No implementation found for interface: " + interfaceClazz);
            }
            if (implementations.size() > 1) {
                throw new IllegalArgumentException("Multiple implementations found for interface: " + interfaceClazz);
            }
            return implementations.get(0);
        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException("Error on get implementation for interface: " + interfaceClazz, e);
        }
    }
    
}
