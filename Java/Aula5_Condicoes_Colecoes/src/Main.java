public class Main {
    public static void main(String[] args) {
    // Trabalhando com blocos
    // Parênteses () - Tupla/conjunto de dados
    // Chaves {} - Bloco de execução - escopo
    // Colchete [] - Indicação de Coleção
    // Diamante <> - Tipos genéricos

    // Expressões Booleanas
        boolean lightIsOn = true;
    // Simples - Avalia o próprio boolean
        System.out.println(lightIsOn);
        //System.out.println(lightIsOn == true); // Redundância!!!!!!!!!! NÃO FAZER

    // Média - Operadores de comparção
        System.out.println(10 > 9);

    // Complexa - operadores lógicos
        System.out.println( 10 < 9 && lightIsOn);

    // A Sintaxe do IF
        // Sintaxe: if(expressão booleana){instruções a serem executadas}
        if(lightIsOn){
            System.out.println("A luz está ligada");
        }
        // Não é obrigatório else, entretanto, a condição precisa ser TRUE

    // A Sintaxe do ELSE
    // O ELSE vem SEMPRE DEPOIS de um IF
    // Sintaxe: else{instruções a serem executadas}
        if (10 > 9){
            System.out.println("O primeiro número é maior");
        }
        else{
            System.out.println("O primeiro número é menor");
        }
        //Trabalhando com expressões complexas
        String user = "Admin";
        String password = "1234";

        // valida duas colunas de dados no login: user e senha
        // .equals = trabalha com classes tipo String e tal (==)
        if(user.equals("FiapUser") && password.equals("Fiap1234")){
            System.out.println("Login efetuado com sucesso!");
        }
        else{
            System.out.println("Erro ao efetuar o login");
        }

        //Operador OR ||
        boolean credito = true;
        boolean debito = false;

        if (credito || debito){
            System.out.println("Pagamento efetuado com sucesso!");
        }
        else{
            System.out.println("Erro ao processar pagamento.");
        }

        // Trabalhando com o Operador NOT !
        String textField = "Joaquim da Silva";

        if(!textField.isEmpty()){
            System.out.println(String.format("Nome encontrado: %s", textField));
        }
        else{
            System.out.println("Preencha o campo corretamente");
        }

        //Trabalhando com if / else if / else
        // vale a pena usar else if por até 2 vezes após melhor usar Switch case
        String semaforo = "Yellow";

        if(semaforo.equals("Vermelho")){
            System.out.println("Pare!");
        }
        else if(semaforo.equals("Amarelo")){
            System.out.println("Atenção...");
        }
        else{
            System.out.println("Siga.");
        }

        // Trabalhando com switch/case
        int diaSemana = 1;

        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;

            // Caso não seja coberto por um case: //tem o padrão
            default:
                System.out.println("dia da semana não encontrado, arruma caralho");
        }

        // Trabalhando com operador ternário - operador elvis ?:
        // Qualquer if/else pode ser substituido por Elvis
        // A terceira possibilidade sempre é excluida
        int horaDia = 10;

        String resultado = (horaDia < 18) ? "Que dia bosta" : "Que noite lixo";
        System.out.println(resultado);

        // Coleção - conjunto de dados - só pode ter um tipo de dado

        // Arrays primitivos [] - são rápidos, mas limitados
        // Todos arrays de JAVA tem Indice de base 0 - OU SEJA COMEÇA DO 0
        int[] numParesUmDigito = {2, 4, 6, 8};
                               // 0, 1, 2, 3
        String[] frutasComM={
            "Melancia",
            "Maça",
            "Melão",
            "Mamão",
            "Marmelo"
        };

        // Imprimindo um elemento de um Array Primitivo
        // Qualquer aplicação que tente acessar um indice que não existe vai quebrar
        System.out.println(frutasComM[3]);

        // Tentando imprimir um array inteiro
        // Por enquant é exibido apenas o endereço de memoria
        System.out.println(frutasComM);
        // Listas - São mais lentas, mas extremamente cheia de recursos






















    }

}