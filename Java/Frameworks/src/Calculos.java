/**
 * Esse é um comentario em JavaDoc
 * @author João Victor
 * @since 07/10/2025
 * @see main
 *  <h3> Coemntario javadoc</h3>
 *  <p> Serve para documentar o código;</p>
 *  <p> Pode ser visualizado formatado</p>
 *  <p> Tem a capacidade de exportar toda a documentação em </p>
 */


public class Calculos {
    private int quantidadeItens;

    public Calculos(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public int acrescentaritem(){
        return quantidadeItens ++;
    }

    public int removerItem(){
        return quantidadeItens --;
    }

    @Override
    public String toString(){
        return "Calculos{"+
                "QuantidadeItens= " + quantidadeItens+
                "}";
    }
}
