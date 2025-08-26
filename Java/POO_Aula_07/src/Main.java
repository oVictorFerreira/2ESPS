public class Main {
    public static void main(String[] args) {
        // Criando objetos da classe Carro
        // Nome da classe - Molde = novo objeto a ser criado
        Carro carroA = new Carro();

        // Preenchendo as propriedades de carroA
        carroA.cor = "Azul";
        carroA.fabricante = "Volkswagen";
        carroA.modelo ="Polo";
        carroA.preco = 80000;
        carroA.kilometragem = 12;

        // Utilizando os métodos

        carroA.acelerar();
        carroA.frear();
    }
}