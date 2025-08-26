public class Pet {
    // Propriedades - Variáveis
    // São as características que o objeto terá:
    int id;
    String nome;
    String raca;
    String cor;
    int idade;


    // Métodos - Funções
    // São as ações qie o nosso objeto executará
    void imprimirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
    }
}
