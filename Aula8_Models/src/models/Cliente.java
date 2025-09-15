package models;

//public significa que qualquer página do nosso projeto esteja público
//Quando tiramos o público, ela começa a trabalhar com processo padrão, o default, ele só permite que essa classe seja acessada dentro da prórpia pasta, ou seja, precisa estar em models
public class Cliente {

    //Bom usar o T0D0 para sinalizarcoisas que precisam ser feitas
    //E também, temos o F1XME para coisas por concertar

    //DONE: Propriedades
    private String nome; //Utilizamos o privado para permitir que use apenas no proprio, processo de encapsulamento
    private String cpf;

    //DONE: Construtores
    //Métodos construtores nos ajudam a construir um objeto que não tenha informação em nulo
    //Sintaxe: NomeIgualAoDaClasse(){} - mesma coisa que escrever o outro mét0do
    //Precisamos colocar o público para ele acessar no main
    public Cliente(String nome, String cpf){
        //Paaso cada parâmetro para a sua propriedade correspondente
        //Utilizamos a palavra reservada this para indicar a propriedade
        this.nome = nome;
        this.cpf = cpf;

    }

    //DONE: Métodos GETTER
    //São métodos que permitem fazer a leitura de um dado privado

    public String getNome(boolean eGerente) {

        if(eGerente){
            return nome;
        }
        else {
            return "Acesso não permitido";
        }
    }

    public String getCpf(boolean eGerente) {

        if(eGerente){
            return cpf;
        }
        else {
            return "Acesso não permitido";
        }

    }


    //DONE: Métodos SETTER
    //São métodos que permitem fazer a modificação de um dado privado
    public void setNome(boolean eGerente, String novoNome){

        if (eGerente){
            this.nome = novoNome;
        }
        else {
            System.out.println("Acesso não permitido");
        }
    }

    public void setCpf(boolean eGerente, String novoCpf){

        if (eGerente){
            this.nome = novoCpf;
        }
        else {
            System.out.println("Acesso não permitido");
        }
    }




    //DONE: Métodos próprios
    void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }

}