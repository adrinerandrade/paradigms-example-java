package reflection.exercicio;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class InterfaceImplementationLocator {

    public static <T> List<Class<? extends T>> findImplementations(Class<T> interfaceClass, String packageName) throws IOException, ClassNotFoundException {
        List<Class<? extends T>> implementations = new ArrayList<>();

        // Convert the package name to a path
        String path = packageName.replace('.', '/');
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Enumeration<URL> resources = classLoader.getResources(path);

        // Process each resource directory in the package
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            File directory = new File(resource.getFile());

            if (directory.exists()) {
                for (String fileName : directory.list()) {
                    // Check if the file is a .class file
                    if (fileName.endsWith(".class")) {
                        String className = fileName.substring(0, fileName.length() - 6);
                        Class<?> clazz = Class.forName(packageName + "." + className);

                        // Check if the class implements the desired interface and is not abstract
                        boolean isComponent = clazz.getAnnotation(CustomComponent.class) != null;
                        if (interfaceClass.isAssignableFrom(clazz) && !Modifier.isAbstract(clazz.getModifiers()) && isComponent) {
                            implementations.add((Class<? extends T>) clazz);
                        }
                    }
                }
            }
        }
        return implementations;
    }

}
