package fluent;

public class FluentMain {
    public static void main(String[] args) {
        System.out.println("Rodando Main");


        //Utilizando api propria

        FPedido pedido = new FPedido()
                .paraCliente(new FCliente("Joao"))
                .incluirItem(1, "Arroz")
                .incluirItem(3, "Peitos de Frango")
                .fecharPedido();
    }
}
