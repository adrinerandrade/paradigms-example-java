package concurrent.creation;

public class CriarThreadExemplo02 {

    public static void main(String[] args) {
        System.out.println("Executando na thread: " + Thread.currentThread().getName());
        new MyCustomThread().start();
    }

}
