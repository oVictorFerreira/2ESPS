package models;

public class ImpressoraString {

    //DONE: Propriedades
    private String dado;

    //DONE: Contrutores

    public ImpressoraString(String dado) {
        this.dado = dado;
    }

    //DONE: Getters e Setters

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    //DONE: Métodos
    public void imprimirDado(){
        System.out.println(dado);
    }

}
