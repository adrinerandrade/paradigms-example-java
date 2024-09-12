package concurrent.threadpool;

public class MinhaTarefa implements Runnable  {

    private String nome;

    public MinhaTarefa(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        System.out.println("Executando tarefa " + nome + " em " + Thread.currentThread().getName());
    }

}
