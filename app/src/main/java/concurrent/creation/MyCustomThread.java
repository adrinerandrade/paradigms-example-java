package concurrent.creation;

public class MyCustomThread extends Thread {

    public MyCustomThread() {
        super(() -> System.out.println("Executando minha Thread customizada: " + Thread.currentThread().getName()));
        setName("my-custom-thread-name");
    }

}
