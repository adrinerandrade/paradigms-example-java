package reflection.proxies.injection.exercicio;

import reflection.annotations.LogExecution;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInvocationHandler implements InvocationHandler {
    private final Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method implementationMethod = target.getClass().getMethod(method.getName(), method.getParameterTypes());
        boolean logExecution = implementationMethod.getDeclaredAnnotation(LogExecution.class) != null;

        if (logExecution) System.out.println("Method " + method.getName() + " is called with arguments " + java.util.Arrays.toString(args));
        Object result = method.invoke(target, args);
        if (logExecution) System.out.println("Method " + method.getName() + " returned " + result);

        return result;
    }
}
