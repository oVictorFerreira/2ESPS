//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Tipos Primitivos

        int NumInteiro = 10;
        float numDec = 8.55f;
        char caractere = 'B'; // Obrigatoriamente precisa ser aspas simples se for um UNICO caractere

        //Trabalhando com Classes
        // String é a classe para se trabalhar com textos
        // os Textos devem ser escritos entre "aspas duplas"
        // Recomenda-se que uma string tenha até 67k caracteres
        // Tentar evitar Strings vazias ou em branco.

        String umTexto = "um texto";

        //Três formas da string:
        // Forma 1 - String com conteúdo
        String comConteudo = "Com conteúdo";

        // Forma 2 - String vazia (NAO É UMA STRING NULA)
        String vazia = "";

        // Forma 3 - String em branco
        String emBranco = "   ";

        System.out.println(vazia);
        System.out.println(emBranco);

        //Problemas com String
        String data = "08/10/1988";
        String numeroInteiro = "10";
        String numeroDec = "77.99";

        //Numeros inteiros nao podem começar com 0 e não é possivel inserir vários pontos, nem caractere especial, logo, nesse caso é uma string
        String CPF = "011.987.678-00";

        //Método toString() transforma em string


    }
}