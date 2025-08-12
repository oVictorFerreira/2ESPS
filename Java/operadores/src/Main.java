//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Atribuindo valores - Operador é opcional, precisa estar antes de quem vai dar valor

        var dado = 10;
        dado = 11;
        dado = 12;

        //Operadores Matemáticos +, -, * e /

        var som = 10 + 10;
        var sub = 20 - 10;
        var mul = 3 * 3;
        var div = 30 / 10;

        //Atribuindo e Operando simultaneamente - Operadores += e -=
        var ValorA = 10;

        ValorA = ValorA + 10;
        System.out.println(ValorA);

        // De uma forma mais otimizada, tipo python
        ValorA += 10;
        System.out.println(ValorA); // comando sout gera esse

        ValorA -= 10;
        System.out.println(ValorA);

        //Incremento e Decremento - Operadores ++ e --

        var ValorB = 20;

        ValorB ++; //De um em um - 1+1+1
        System.out.println(ValorB);

        ValorB --; // 1-1-1
        System.out.println(ValorB);
        
    }
}