package models;

//Para indicar uma classe generica, utilizamos uma propriedade generica
// O nome da propriedade generica por ser definido por una letra
// Letras mais utilizadas:
// T - Type
// E - Element
// N - Number
// K - Key
// V - Value
public class ImpressoraGenerica<T> {

    // DONE: Propriedades
    private T dado;

    // DONE: Construtores

    public ImpressoraGenerica(T dado) {
        this.dado = dado;
    }

    // DONE: Getters e Setters

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    // DONE: Métod0

    public void imprimirDado(){
        System.out.println(dado);
    }
}
