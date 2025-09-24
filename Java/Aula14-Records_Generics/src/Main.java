import models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Criando objetos baseados em Records
        Documento docA = new Documento("397.661.338-08", "57.377.655-0");
        System.out.println(docA.cpf());
        System.out.println(docA.rg());

        //Trabalhando com Genéricos
        // O Diamante <> é um indicativo da utilização de genéricos
        ArrayList<String> beatles = new ArrayList<>();
        beatles.add("John");
        beatles.add("Paul");
        beatles.add("George");
        beatles.add("Ringo");

        // Trabalhando com tipos sem Genericos

        ImpressoraString dadoA = new ImpressoraString("Bucete");
        dadoA.imprimirDado();

        ImpressoraInteger dadoB = new ImpressoraInteger(10);
        dadoB.imprimirDado();

        // Trabalhando com ImpressoraGenerica - Não imprimem primitivos
        ImpressoraGenerica<String> dadoC = new ImpressoraGenerica<>("Texto");
        dadoC.imprimirDado();

        //Utilizando coordenadas

        Coordenadas<String, Integer> coordA = new Coordenadas("245", 444);

    }
}