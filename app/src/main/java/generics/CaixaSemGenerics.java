package generics;

public class CaixaSemGenerics {

    private Object conteudo;

    public void adicionar(Object item) {
        this.conteudo = item;
    }

    public Object obter() {
        return conteudo;
    }

}
