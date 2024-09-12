package reflection.operations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class InvocarMetodoExemplo {

    public static void main(String[] args) throws Exception {
        // Criar uma instância de Pessoa
        Class<?> pessoaClasse = Class.forName("reflection.operations.Pessoa");
        Constructor<?> construtor = pessoaClasse.getConstructor(String.class, int.class);
        Object pessoa = construtor.newInstance("João", 30);

        // Invocar o método "dizerOla" dinamicamente
        Method metodoDizerOla = pessoaClasse.getMethod("dizerOla");
        metodoDizerOla.invoke(pessoa); // Chama o método dizerOla
    }

}
