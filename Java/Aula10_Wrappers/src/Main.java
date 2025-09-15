import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Tipos Primitivos
        //Vantagem: Performance maior
        //Desvantagem: Baixo poder de modificação e manipulação
        byte valorByte = 10;
        short valorShort = 100;
        int valorInt = 10000;
        long valorLong = 1000000;
        float valorFloat = 10.5f;
        double valorDouble = 11.555d;
        boolean valorBool = true;
        char valorChar = 'A';

        //Trabalhando com Wrappers
        //Vantagem: Alto poder de modificação e manipulação
        //Desvantagem: Performance menor
        Byte wrapByte = 10;
        Short wrapShort = 100;
        Integer wrapInt = 10000;
        Long wrapLong = 1000000L; //L é obrigatório
        Float wrapFloat = 10.5f; //f é obrig
        Double wrapDouble = 18.555d;
        Boolean wrapBool = true;
        Character wrapChar = 'T';

        //Onde Utilizar Wrappers?
        //- Array de java.util só podem utilizar objetos
        ArrayList<Integer> umArray = new ArrayList();

        //- Para fazer parses de dados em String
        //ALERTA!!! A formatação da string deve estar de
        // acordo com o tipo desejado
        Byte byteFromString = Byte.parseByte("10");
        Short shortFromString = Short.parseShort("100");
        Integer intFromString = Integer.parseInt("10000");
        Long longFromString = Long.parseLong("1000000");
        Float floatFromString = Float.parseFloat("10.89");
        Double doubleFromString = Double.parseDouble("88.66");
        Boolean boolFromString = Boolean.parseBoolean("werkjhkqwrej");
        System.out.println(boolFromString);

        //- Criando objetos a partir de valores primitivos

        Byte byteFromByte = Byte.valueOf(valorByte);
        Short shortFromShort = Short.valueOf(valorShort);
        Integer integerFromInt = Integer.valueOf(valorInt);
        Long longFromLong = Long.valueOf(valorLong);
        Float floatFromFloat = Float.valueOf(valorFloat);
        Double doubleFromDouble = Double.valueOf(valorDouble);
        Boolean boolFrombool = Boolean.valueOf(valorBool);
        Character characterFromChar = Character.valueOf(valorChar);

        // Type Casting - mudança de tipos de dados
        // Widening Casting - É automática e sempre do menor para o maior
        // Sempre conseguimos colocar um menor dentro de um maior e nunca o contrário
        byte numParaCast = 40;
        short novoNumShort = numParaCast; // Pq cabe byte (até 128) dentro de short (até 32k)
        int novoNumInt = novoNumShort;
        long novoNumLong = novoNumInt;
        float novoNumFloat = novoNumLong;
        double novoNumDouble = novoNumFloat;

        // Narrowing Casting - Manual - Maior para o menor
        // ALERTA = QIANDO ESSE TIPO DE CASING É FEIOTO PERDEMOS INFORMAÇÕES
        float floatParaCasting = 18.55f;
        int numModificado = (int) floatParaCasting;
        System.out.println(numModificado);

    }
}