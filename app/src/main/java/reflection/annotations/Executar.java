package reflection.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  // Anotações podem se retidas em tempo de execução ou somente em tempo de compilação.
                                     // Se for em tempo de compilação, ao executar a aplicação não será possível recuperá-la.
                                     // Nesta configuração RUNTIME, ela permanece disponível em tempo de execução.
@Target(ElementType.METHOD) // A anotação pode ser aplicada a métodos.
public @interface Executar {
    int vezes() default 1;  // Neste exemplo, a anotação irá indicar quantas vezes executar o método.
}
