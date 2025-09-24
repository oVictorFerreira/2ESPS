package models;

//Records providenciam classes rápidas que são capazes de criar objetos imutaveis
// Produzem automáticamente construtores e GETTERS para as suas propriedades
// São utilizadas, geralmente,  para abrigar um conceito chado de DTO - Data Transfer Object
public record Documento(String cpf, String rg) {
    //Não precisa programar NADA!!!
    // A não ser, que haja necessidade de algum métod0 a mais

}
