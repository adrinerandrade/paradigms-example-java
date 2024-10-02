package reflection.proxies.exercicio.data;

public class Passaro implements Animal {

    @Override
    public void movimentar() {
        System.out.println("Passaro andando preparando para a decolagem.");
        System.out.println("Passaro voando.");
        System.out.println("Passaro pousou :)");
    }

}
