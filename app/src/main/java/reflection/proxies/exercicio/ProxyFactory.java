package reflection.proxies.exercicio;

import reflection.exercicio.LoggingInvocationHandler;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static <T, R extends T> T create(Class<T> interfaceClazz, Class<R> implementationClass) {
        R instance;
        try {
            instance = implementationClass.newInstance();
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
