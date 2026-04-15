package orientacao;

public class OItem {

    //Propriedades

    private Integer quantidade;
    private String itemNome;

    //Construtores

    public OItem(Integer quantidade, String itemNome) {
        this.quantidade = quantidade;
        this.itemNome = itemNome;
    }

    //Getters

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getItemNome() {
        return itemNome;
    }

    @Override
    public String toString() {
        return "OItem{" +
                "quantidade=" + quantidade +
                ", itemNome='" + itemNome + '\'' +
                '}';
    }
}
