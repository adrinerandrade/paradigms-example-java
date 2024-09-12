package concurrent.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExemplo {

    public static void main(String[] args) {
        // Criar uma tarefa assíncrona com CompletableFuture
        try (ExecutorService executor = Executors.newFixedThreadPool(1)) {
            CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return 42;
            }, executor);

            // Processar o resultado sem bloquear a thread principal
            completableFuture.thenApply(resultado -> {
                System.out.println("Resultado: " + resultado);
                return resultado * 2;
            }).thenAccept(resultadoFinal -> {
                System.out.println("Resultado Final: " + resultadoFinal);
            });

            // Continuar com outras tarefas enquanto a operação assíncrona é executada
            System.out.println("Tarefa assíncrona em execução...");
        }
    }

}
