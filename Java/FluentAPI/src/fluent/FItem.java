package fluent;

public class FItem {

    //Propriedades
    private Integer quantidade;
    private String itemNome;

    //Construtores
    public FItem(Integer quantidade, String itemName) {
        this.quantidade = quantidade;
        this.itemNome = itemName;
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
        return "FItem{" +
                "quantidade=" + quantidade +
                ", itemNome='" + itemNome + '\'' +
                '}';
    }
}