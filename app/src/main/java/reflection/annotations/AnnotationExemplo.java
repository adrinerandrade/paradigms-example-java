package reflection.annotations;

import java.lang.reflect.Method;

public class AnnotationExemplo {

    public static void main(String[] args) throws Exception {
        MinhaClasse obj = new MinhaClasse();

        // Obter todos os métodos da classe
        Method[] methods = obj.getClass().getDeclaredMethods();

        // Percorrer os métodos para verificar se possuem a anotação @Executar
        for (Method method : methods) {
            if (method.isAnnotationPresent(Executar.class)) {
                // Obter a anotação @Executar
                Executar executar = method.getAnnotation(Executar.class);

                // Invocar o método com base no valor da anotação
                for (int i = 0; i < executar.vezes(); i++) {
                    method.invoke(obj);  // Invoca o método
                }
            }
        }
    }

}
