import javax.naming.PartialResultException;

public class Main {
    public static void main(String[] args) {


        // Provocando Exceptions
        String [] frutas = {"Maça", "Banana", "Mamao"};

        //System.out.println(frutas[3]); //Ao acessar Indices

        //int divisao = 10/0; //Divisão por Zero

        String nula = null;
        //System.out.println(nula.toUpperCase());

        // Java é pré-compilado

        float altura = 1.80f;

        //Erros sao apontados com defeito de sintaxe e sempre sao apresentados na pré-compilação
        //Falta de simbolos - ; () {} [] <> . f L ;
        //Incompatibilidade de tipos:
        //Declarações nao resolvidas

        String umTexto = "Um Texto";
        //umTexto = 10;

        //System.out.println(pipoca);

        //Três formas para contonar uma Exception
        //Forma 1 - Providenciar oq é necessário para Não quebra

        umTexto = "Outro Texto";
        System.out.println(frutas[2]);


        //Forma 3 - Estrutura try/catch

        //try {
        //Se faz a tentativa de executar alguma instrução

        // System.out.println(frutas[200]);
        // System.out.println("Foi");
        // }
        // catch(ArrayIndexOutOfBoundsException umaExcep){
        // System.out.println("Erro ao executar o códico");
        // System.out.println(umaExcep);
        // }

        //try {
        //umTexto = "salve";
        //System.out.println(umTexto.toUpperCase());
        //System.out.println("Foi");
        //}
        //catch (NullPointerException umaExcep){
        //   System.out.println("Erro ao executar");
        // System.out.println(umaExcep);
        //}

        //Criando estrutura try/cattch para captar qualquer exception

        try{
            System.out.println(frutas[0]);
            int duv = 84/2;
            umTexto = null;
            System.out.println(umTexto.toUpperCase());
            System.out.println("foii");
        }
        catch(Exception umaExcep){
            System.out.println("Erro ao executar o código:");
            System.out.println(umaExcep);
        }


        //Trabalhando com o bloco finally

        try {
            int div = 76/0;
            System.out.println("Foi");
        }
        catch (Exception umaExcep){
            System.out.println("não foi");
        }
        //O finally sempre sera executado
        finally {
            System.out.println("Chegou ao final da execução");
        }


    }
}