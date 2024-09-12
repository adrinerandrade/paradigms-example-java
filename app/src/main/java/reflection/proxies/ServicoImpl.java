package reflection.proxies;

public class ServicoImpl implements Servico {

    @Override
    public void executar() {
        System.out.println("Serviço executado.");
    }

}