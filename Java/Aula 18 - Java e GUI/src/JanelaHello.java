import javax.tools.Tool;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaHello {
    public static void main(String[] args) {
        // DONE: Criar Janela
        //Elemento Frame - A nossa Janela
        Frame frame = new Frame("Trabalhando com Frames e Labels");
        frame.setSize(800,600);//Definindo Tamanho da Janela

        // Calculo para a posição centralizada da janela
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamanhoTela.width - frame.getWidth())/2;
        int y = (tamanhoTela.height - frame.getHeight())/2;
        frame.setLocation(x,y);

        // Indicando função para o botão de fechar
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // por padrão chama o metod0 da classe pai
                System.exit(0);
            }
        });

        //TODO: Criar elementos de interface

        Label label = new Label("Bem-vindo(a) ao AWT!");
        label.setAlignment(Label.CENTER);

        // Para cadas elemento de interface frafica, temos os getter e setters
        // muda o texto na hora que clicar no botão por exemplo
        label.setText("Texto Novo");
        frame.add(label);

        //Exibindo janela
        frame.setVisible(true);
    }
}