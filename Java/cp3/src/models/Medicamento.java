package models;

/**
 * Representa um medicamento prescrito a um paciente.
 *
 * <p>Contém informações sobre o nome (ou fórmula) do medicamento e sua dosagem em miligramas (mg).</p>
 *
 * <p><b>Exemplo de uso:</b></p>
 * <pre>
 *     Medicamento medicamento = new Medicamento("Paracetamol", 500);
 *     medicamento.imprimirDados();
 * </pre>
 *
 * @author João Ferreira, Erick Cardoso, Gabrielly Candido, Luiza Saracol
 * @version 1.0
 */
public class Medicamento {

    /** Nome ou fórmula do medicamento. */
    private String formula;

    /** Dosagem do medicamento em miligramas (mg). */
    private int dosagem;

    /**
     * Constrói um novo objeto {@code Medicamento} com a fórmula e dosagem informadas.
     *
     * @param formula o nome ou fórmula do medicamento (ex: "Ibuprofeno", "Amoxicilina")
     * @param dosagem a dosagem do medicamento em miligramas
     *
     * <p><b>Exemplo:</b></p>
     * <pre>
     *     Medicamento medicamento = new Medicamento("Paracetamol", 500);
     * </pre>
     */
    public Medicamento(String formula, int dosagem) {
        this.formula = formula;
        this.dosagem = dosagem;
    }

    /**
     * Retorna a fórmula (ou nome) do medicamento.
     *
     * @return a fórmula do medicamento
     *
     * <p><b>Exemplo de retorno:</b></p>
     * <pre>
     *     medicamento.getFormula(); // "Paracetamol"
     * </pre>
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Retorna a dosagem do medicamento em miligramas.
     *
     * @return a dosagem em mg
     *
     * <p><b>Exemplo de retorno:</b></p>
     * <pre>
     *     medicamento.getDosagem(); // 500
     * </pre>
     */
    public int getDosagem() {
        return dosagem;
    }

    /**
     * Retorna uma representação textual simples do medicamento.
     *
     * @return uma string contendo a dosagem do medicamento
     */
    @Override
    public String toString() {
        return "Medicamento{" +
                "dosagem=" + dosagem +
                '}';
    }

    /**
     * Imprime no console os dados do medicamento.
     *
     * <p>Exibe o nome (fórmula) e a dosagem formatados.</p>
     *
     * <p><b>Exemplo de saída:</b></p>
     * <pre>
     * Medicamento: Paracetamol
     * Dosagem: 500
     * </pre>
     */
    public void imprimirDados() {
        System.out.println("Medicamento: " + formula);
        System.out.println("Dosagem: " + dosagem);
    }
}
