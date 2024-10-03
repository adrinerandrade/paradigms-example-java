package reflection.exercicio;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {

    private static final Map<Class<?>, Object> x = new HashMap<>();

    static {
        x.put(MyBean.class, new MyBean());
    }

    public static <T> T getInstance(Class<?> type) {
        return (T) x.get(type);
    }

}
