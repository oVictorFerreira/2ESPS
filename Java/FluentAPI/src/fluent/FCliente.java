package fluent;

public class FCliente {

    //Propriedades
    private  String clientenNome;

    //Contrutores
    public FCliente(String clientenNome) {
        this.clientenNome = clientenNome;
    }

    //Getters
    public String getClientenNome() {
        return clientenNome;
    }

    @Override
    public String toString() {
        return "FCliente{" +
                "clientenNome='" + clientenNome + '\'' +
                '}';
    }
}
