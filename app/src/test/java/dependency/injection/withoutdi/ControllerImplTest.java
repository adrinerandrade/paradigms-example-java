package dependency.injection.withoutdi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ControllerImplTest {

    @Test
    void test() {
        ControllerImpl controller = new ControllerImpl();
        controller.register();

        /* Como vou fazer um teste de qualidade com o Controller, validando que o Id gerado pelo serviço é o correto inserido no histórico
         * se a implementação do service é padrão e pode variar a cada execução?
         * Em alguns casos, a implementação ainda se torna inviável, se minha dependência tiver chamadas a API externas ou ao banco */
        List<String> executionHistory = controller.getExecutionHistory();
        Assertions.assertEquals(1, executionHistory.size());
        Assertions.assertEquals("?????", executionHistory.get(0)); // Como validar o conteúdo? Como validar que o controller inseriu o histórico corretamente a partir do retorno do Service
                                                                            // e não tem um bug que pode estar inserindo outro valor???
    }

}