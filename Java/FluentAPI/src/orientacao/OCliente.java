package orientacao;

public class OCliente {
    // Propriedades
    private String clienteNome;

    // Construtores

    public OCliente(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    //Getters

    public String getClienteNome() {
        return clienteNome;
    }

    @Override
    public String toString() {
        return "OCliente{" +
                "clienteNome='" + clienteNome + '\'' +
                '}';
    }
}
