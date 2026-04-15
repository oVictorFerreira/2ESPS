package orientacao;

import java.util.ArrayList;

public class OrientacaoMain {

    public static void main(String[] args) {

        System.out.println("Rodando Orientacao");

        OCliente cliente = new OCliente("Joaquim José");
        ArrayList<OItem> listaCompra = new ArrayList<>();
        listaCompra.add(new OItem(10, "Pão"));
        listaCompra.add(new OItem(1, "Leite"));
        listaCompra.add(new OItem(100, "Mortadela"));

        OPedido pedido01 = new OPedido(cliente, listaCompra);
        pedido01.fecharPedido();
    }
}
