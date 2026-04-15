package orientacao;

import java.util.ArrayList;

public class OPedido {

    //Priopriedades
    private OCliente cliente;
    private ArrayList<OItem> carrinho;

    //Construtores

    public OPedido(OCliente cliente, ArrayList<OItem> carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    //Getters
    public OCliente getCliente() {
        return cliente;
    }

    public ArrayList<OItem> getCarrinho() {
        return carrinho;
    }

    //Outros Métodos
    @Override
    public String toString() {
        return "OPedido{" +
                "cliente=" + cliente +
                ", carrinho=" + carrinho +
                '}';
    }

    public void fecharPedido(){

        System.out.println("Pedido realizado para o Cliente: " + getCliente().getClienteNome());
        System.out.println("Itens Incluídos: ===================");
        carrinho.stream().forEach(umItem -> System.out.println(umItem));
        System.out.println("Pedido fechado com sucesso! ========");
    }
}
