package reflection.operations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObtemDadosClasseExemplo {

    public static void main(String[] args) throws ClassNotFoundException {
        // Obter a classe Pessoa via Reflection
        Class<?> pessoaClasse = Class.forName("reflection.operations.Pessoa");

        // Exibir o nome da classe
        System.out.println("Classe: " + pessoaClasse.getName());

        // Listar os métodos da classe
        System.out.println("\nMétodos:");
        for (Method metodo : pessoaClasse.getDeclaredMethods()) {
            System.out.println(metodo.getName());
        }

        // Listar os atributos da classe
        System.out.println("\nAtributos:");
        for (Field campo : pessoaClasse.getDeclaredFields()) {
            System.out.println(campo.getName());
        }
    }

}
