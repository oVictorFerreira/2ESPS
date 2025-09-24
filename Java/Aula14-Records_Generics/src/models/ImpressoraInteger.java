package models;

public class ImpressoraInteger {

    //DONE: Propriedades
    private Integer dado;

    //DONE: Contrutores

    public ImpressoraInteger(Integer dado) {
        this.dado = dado;
    }

    //DONE: Getters e Setters

    public Integer getDado() {
        return dado;
    }

    public void setDado(Integer dado) {
        this.dado = dado;
    }

    //DONE: Métodos
    public void imprimirDado(){
        System.out.println(dado);
    }

}
