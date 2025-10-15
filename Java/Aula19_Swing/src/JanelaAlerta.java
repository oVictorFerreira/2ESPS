import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaAlerta {
    public static void main(String[] args) {

        // Criando a Janela Principal
        JFrame frame = new JFrame("Trabalhando com JFrame e JLabel");
        frame.setSize(600,300); // Determinando Tamanho
        frame.setLocationRelativeTo(null); // Centralizando janela
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Criando elemento Label
        JLabel label = new JLabel("Olá Swing!");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(label);


        // Adicionando comportamento ao botão fechar

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //Exibindo uma caixa de alerta
                int resposta = JOptionPane.showConfirmDialog(
                        frame, // Local de exibição
                        "Tem certeza que deseja fechar a janela?",  //MSG
                        "Confirmar Saida", // Titulo
                        JOptionPane.YES_NO_OPTION, //Tipos de botão
                        JOptionPane.QUESTION_MESSAGE, //Indicando o tipo de caixa
                        new ImageIcon(JanelaAlerta.class.getResource("img.png"))

                ); //Caixa de dialogo que sobrepoe a janela atual

                // Verificar se o botão Sim foi utilizado
                if (resposta == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        // Exibindo janela
        frame.setVisible(true);

    }
}