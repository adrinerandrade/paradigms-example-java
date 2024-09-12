package concurrent.threadpool;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExemplo {

    public static void main(String[] args) {
        // Cria um pool de 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Runnable tarefa = new MinhaTarefa(String.valueOf(i));
            executor.execute(tarefa);  // Executa a tarefa em uma thread do pool
        }

        executor.shutdown();  // Finaliza o pool quando todas as tarefas forem concluídas
    }
}
