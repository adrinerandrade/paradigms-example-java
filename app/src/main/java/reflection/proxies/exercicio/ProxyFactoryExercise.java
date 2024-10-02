package reflection.proxies.exercicio;

import reflection.proxies.exercicio.data.Animal;
import reflection.proxies.exercicio.data.Automovel;
import reflection.proxies.exercicio.data.Carro;
import reflection.proxies.exercicio.data.Passaro;

public class ProxyFactoryExercise {

    public static void main(String[] args) {
        System.out.println("\n**** Animal ****\n");

        Animal animal = new Passaro();
        Animal animalComProxy = ProxyFactory.create(Animal.class, Passaro.class);

        animal.movimentar();
        System.out.println();
        animalComProxy.movimentar();

        System.out.println("\n**** Automóvel ****\n");

        Automovel automovel = new Carro();
        Automovel automovelComProxy = ProxyFactory.create(Automovel.class, Carro.class);

        automovel.locomover();
        System.out.println();
        automovelComProxy.locomover();
    }

}
