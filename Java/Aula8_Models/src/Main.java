import models.Cliente;

public class Main {
    public static void main(String[] args) {

        //Não podemos dar o acesso direto a uma propriedade, isso não é uma boa pr[atica, precisamos criar uma chave de acesso
        //Criar o objeto vazio, também não é o recomendado, ele pode quebrar a aplicação

        //Criando um objeto com mét0do construtor
        Cliente clienteA = new Cliente("Joaquim da Silva", "111.111.111-11"); //Precisamos passar a informação dos parametros obrigatóriamente
        Cliente clienteB = new Cliente("Maria Francisca", "222.222.222-22");

        //Trabalhando com repositórios não inicializados
        //Dados não inicializados não ocuparão espaço em memória
        Cliente clienteC; //Podemos não inicializar os dados dele, deixamos ele em espera, colocar os dados depois

        //Trabalhando com repositórios inicializados
        String nome = "Antonio Jorge";
        String cpf = "333.333.333-33";
        Cliente clienteD = new Cliente(nome, cpf);

        System.out.println(clienteD.getNome(true));

        clienteD.setNome(true, "Francisco da silva");
        System.out.println(clienteD.getNome(true));


    }
}