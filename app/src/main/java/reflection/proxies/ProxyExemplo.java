package reflection.proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyExemplo {

    public static void main(String[] args) {
        // Criar a instância real do serviço
        Servico servicoReal = new ServicoImpl();

        // Criar o proxy dinâmico
        Servico proxyServico = (Servico) Proxy.newProxyInstance(
                servicoReal.getClass().getClassLoader(),
                servicoReal.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // Lógica antes de chamar o método real
                        System.out.println("Antes de executar o serviço");

                        // Chama o método real no objeto real
                        Object resultado = method.invoke(servicoReal, args);

                        // Lógica após chamar o método real
                        System.out.println("Depois de executar o serviço");

                        return resultado;
                    }
                }
        );

        // Chamar o método através do proxy
        proxyServico.executar();
    }
}
