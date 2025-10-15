import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaSomarDoisValores {
    public static void main(String[] args) {
        // DONE: Criar Janela
        //Elemento Frame - A nossa Janela
        Frame frame = new Frame("Soma de Dois Valores");
        frame.setSize(600,300);//Definindo Tamanho da Janela

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

        // não consegue centralizar mais de um elemento em um frame, precisa ser em um painel
        // painel == container (front-end)

        // definindo  que a janela terá çayout com subdivisões
        frame.setLayout(new GridBagLayout());

        //Criando um Painel para centralizar os componentes
        Panel painelCentralizado = new Panel(new FlowLayout(FlowLayout.CENTER));

        // DONE: crição dos componentes
        Label labelValorA = new Label("Valor A");
        Label labelValorB = new Label("Valor B");
        Label labelResultado = new Label("Resultado");

        TextField campoValorA = new TextField(5);
        TextField campoValorB = new TextField(5);
        TextField resultado = new TextField(5);
        resultado.setEditable(false);

        Button botaoSomar = new Button("Somar");
        Button botaoLimpar = new Button("Limpar");

        //Adicionando os componentes
        frame.add(painelCentralizado);

        painelCentralizado.add(labelValorA);
        painelCentralizado.add(campoValorA);
        painelCentralizado.add(labelValorB);
        painelCentralizado.add(campoValorB);
        painelCentralizado.add(botaoSomar);
        painelCentralizado.add(labelResultado);
        painelCentralizado.add(resultado);
        painelCentralizado.add(botaoLimpar);

        // Listener para o botao somar

        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // usando try/catch para pegar erro de usuario burro
                try{
                    double valorA = Double.parseDouble(campoValorA.getText());
                    double valorB = Double.parseDouble(campoValorB.getText());
                    double soma = valorA + valorB;
                    resultado.setText(String.valueOf(soma));
                }
                catch (NumberFormatException exception){
                    System.out.println(exception);
                    resultado.setText("Erro!");


                }

            }
        });

        // Listener botão Limpar

        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoValorA.setText("");
                campoValorB.setText("");
                resultado.setText("");
            }
        });

        // Exibindo janela
        frame.setVisible(true);

    }

}
