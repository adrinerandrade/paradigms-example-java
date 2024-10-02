package generics;

public class GenericsExample {

    public static void main(String[] args) {
        Caixa<String> caixaDeStrings = new Caixa<>();
        caixaDeStrings.adicionar("Olá");
        String conteudoStr = caixaDeStrings.obter();

        CaixaSemGenerics caixaDeObjetos = new CaixaSemGenerics();
        caixaDeStrings.adicionar("Olá");
        String conteudoObj = (String) caixaDeObjetos.obter();
    }

}
