import java.awt.*;
// Abstract window toolkit - Criar interface grafica e gerenciar componentes de janelas
// Funciona apenas com SO, não funciona WEB

public class Main {

    // propriedades
    // static - será utilizado dentro da propria classe
    // public - poderá ser utilizado em outras.

    // Criando Janela
    // Criando o Requadro da janela - Bordas (FRAME)
    static Frame frame;
    // Criando uma caixa de texto
    static Label label;
    // Logo - Partimos para injeção de Dependência
    // Apenas declaramos as classes e criamos construtores

    // utilizando o construtor para injetar as dependencias de frame e label
    public Main(Frame frame, Label label) {
        this.frame = frame;
        this.label = label;
    }

    public static void main(String[] args) {

        frame = new Frame();
        label = new Label("Oi");

        // Definindo o tamanho da janela em pontos
        frame.setSize(300, 300);

        // Definindo o alinhamento do texto
        label.setAlignment(Label.CENTER);

        // Adicionando o texto à janela
        frame.add(label);

        // Apesentando a Janela

        frame.setVisible(true);


    }

    public void meuMetodo(){
        frame.setSize(300,300);
    }
}