import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //Trabalhando com Arrays primitivos

        //Arrays primitovos
        String[] beatles = {"Paul", "Ringo", "George", "John"};

        //Acessando o primeiro índice
        //System.out.println(beatles[0]);

        //Medindo o tamanho do meu array
        //System.out.println(beatles.length);

        //Acessando o ultimo elemento de um array
        //System.out.println(beatles.length - 1);

        //Trabalhando com laçoes de repetição baseados em arrays
        //for each (para cada elemento do array - utilizamos quando usamos em array
        //Sintaxe: for (nomeDeUmElemento : arrayASerUtilizado){instruções A Serem Executadas}
        //for (String umBeatle : beatles){ //Preciso declarar o tipo
        //    System.out.println(umBeatle);
        //}

        //Arrays primitivos são imutaveis quanto ao seu tamanho
        //Mas ainda podemos modificar elementos de um array
        //beatles[0] = "McCartney";
        //System.out.println(beatles[0]);

        //Transformando um array primitivo em uma lista
        //Quando transformamos em lista, conseguimos deixar mais "poderoso"
        //System.out.println(Arrays.toString(beatles)); //Quando colocamos a biblioteca, o java importa em cima sozinho

        //Trabalhando com ArrayList
        //Diamante  <> - Indica utilização de genéricos (é alguem que pode fazer uma substituição geral, para obter o mesmo resultado)
        ArrayList <String> pontosCardeais = new ArrayList<>(); //Estou iniciando uma coleção, uma lista de elementos que por enquanto  está vazia

        //Adicionando elementos a uma lista
        pontosCardeais.add("Norte");
        pontosCardeais.add("Sul");
        pontosCardeais.add("Leste");
        pontosCardeais.add("Oeste");

        //Imprimindo uma lista
        //System.out.println(pontosCardeais);

        //Imprimindo uma elemento de uma lista
        //System.out.println(pontosCardeais.get(0));

        //Medindo o tamanho de uma lista
        //System.out.println(pontosCardeais.size());

        //Acessando o último elemento de uma lista
        //System.out.println(pontosCardeais.get(pontosCardeais.size() - 1));

        //Modificando itens de uma lista
        //pontosCardeais.set(2, "Este");
        //System.out.println(pontosCardeais);

        //Verificando se existe uma ocorrência em uma lista
        //System.out.println(pontosCardeais.contains("Sul"));

        //Removendo um elemento por indice
        //pontosCardeais.remove(0);

        //Removendo um elemento pelo seu conteúdo
        //pontosCardeais.remove("Este");

        //Limpando uma lista
        //pontosCardeais.clear();

        //Trabalhando com for each em uma lista

        //Trabalhando com for each em uma lista
        pontosCardeais.forEach(umPonto -> System.out.println(umPonto));





    }
}