package models;

public class Paciente {

    private String nome;
    private int idade;
    private String email;
    private String cpf;

    public Paciente(String nome, int idade, String email, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idade=" + idade +
                '}';
    }

    public int getIdade() {
        return idade;

    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    //DONE: Métodos próprios
    void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("E-mail: " + email);
    }
}
