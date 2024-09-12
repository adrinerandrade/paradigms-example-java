package concurrent.creation;

public class CriarThreadExemplo {

    public static void main(String[] args) {
        System.out.println("Executando na Thread: " + Thread.currentThread().getName());
        new Thread(() -> {
            System.out.println("Executando na Thread: " + Thread.currentThread().getName());
        }).start();
    }

}
