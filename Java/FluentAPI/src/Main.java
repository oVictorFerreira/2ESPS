import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Criando array vazio
        ArrayList<String> listaFrutas = new ArrayList<>();

        //Populando array
        listaFrutas.add("Mamão");
        listaFrutas.add("Cereja");
        listaFrutas.add("Abacaxi");
        listaFrutas.add("Maça");
        listaFrutas.add("Jamelão");

        listaFrutas.stream().sorted().forEach(umaFruta -> System.out.println(umaFruta)); // FluentAPI nativo
    }
}