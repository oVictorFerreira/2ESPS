package fluent;

import java.util.ArrayList;

public class FPedido {

    //Com o Fluent, temos o objetivo e construir um objeto de forma mais direta;
    //Sem a utilização de contrutores (ou o mínimo possível deles);
    //Encadeando uma série de métodos utilizando o dot sintax (.algumaCoisa().outraCoisa());
    //Para ter certeza da continuidade e fluidez entre as particulas (cada métod0),
    // é impressindivel que o retorno desse métod0 seja do msm tipo do objeto a ser construído (this);

    //Propriedades
    private FCliente cliente;
    private ArrayList<FItem> listaItens = new ArrayList<>();

    //Métodos Fluent
    //Métod0 Fluent para incluir itens na lista
    public FPedido incluirItem(Integer quantidade, String itemNome){

        listaItens.add(new FItem(quantidade, itemNome));

        return this;
    }

    //Métod0 Fluent para indicar um cliente
    public FPedido paraCliente(FCliente cliente){

        this.cliente = cliente;

        return this;
    }

    //Métod0 para fechar o pedido
    public FPedido fecharPedido(){

        System.out.println("Pedido realizado para o Cliente: " + cliente.getClientenNome());
        System.out.println("Itens Incluídos: ===================");
        listaItens.stream().forEach(umItem -> System.out.println(umItem));
        System.out.println("Pedido fechado com sucesso! ========");

        return this;
    }

}
