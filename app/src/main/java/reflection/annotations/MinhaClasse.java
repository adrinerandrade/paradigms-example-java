package reflection.annotations;

public class MinhaClasse {

    @Executar(vezes = 3)
    public void metodoA() {
        System.out.println("Executando método A");
    }

    @Executar(vezes = 2)
    public void metodoB() {
        System.out.println("Executando método B");
    }
}
