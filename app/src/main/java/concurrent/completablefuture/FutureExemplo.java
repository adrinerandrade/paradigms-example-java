package concurrent.completablefuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExemplo {

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submeter uma tarefa que retorna um valor no futuro
        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(1000);
            return 42;
        });

        // Fazer algo enquanto a tarefa está sendo executada
        System.out.println("Tarefa em execução...");

        // Obter o resultado da tarefa (bloqueia até que seja concluída)
        Integer resultado = future.get();

        System.out.println("Resultado: " + resultado);

        executor.shutdown();
    }

}
