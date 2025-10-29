package models.models;

import models.Medicamento;
import models.Medico;
import models.Paciente;
import models.Prescricao;
import java.util.List;

/**
 * Gerencia os cadastros e buscas de médicos, pacientes, medicamentos e prescrições.
 *
 * <p>Esta classe atua como um controlador central para o sistema, permitindo o
 * gerenciamento das principais entidades do modelo.</p>
 *
 * <p><b>Exemplo de uso:</b></p>
 * <pre>
 *     List&lt;Paciente&gt; pacientes = new ArrayList&lt;&gt;();
 *     List&lt;Medico&gt; medicos = new ArrayList&lt;&gt;();
 *     List&lt;Medicamento&gt; medicamentos = new ArrayList&lt;&gt;();
 *     List&lt;Prescricao&gt; prescricoes = new ArrayList&lt;&gt;();
 *
 *     Manager manager = new Manager(pacientes, medicos, medicamentos, prescricoes);
 *
 *     Medicamento medicamento = new Medicamento("Ibuprofeno", 400);
 *     manager.cadastrarMedicamento(medicamento);
 *
 *     manager.buscarMedicamento("Ibuprofeno");
 * </pre>
 *
 * @author João Ferreira, Erick Cardoso, Gabrielly Candido, Luiza Saracol
 * @version 1.0
 */
public class Manager {

    /** Lista de pacientes cadastrados no sistema. */
    private List<Paciente> pacientes;

    /** Lista de médicos cadastrados no sistema. */
    private List<Medico> medicos;

    /** Lista de medicamentos cadastrados no sistema. */
    private List<Medicamento> medicamentos;

    /** Lista de prescrições geradas no sistema. */
    private List<Prescricao> prescricoes;

    /**
     * Constrói um novo gerenciador ({@code Manager}) com as listas de entidades fornecidas.
     *
     * @param pacientes    lista de pacientes cadastrados
     * @param medicos      lista de médicos cadastrados
     * @param medicamentos lista de medicamentos cadastrados
     * @param prescricoes  lista de prescrições registradas
     *
     * <p><b>Exemplo:</b></p>
     * <pre>
     *     Manager manager = new Manager(pacientes, medicos, medicamentos, prescricoes);
     * </pre>
     */
    public Manager(List<Paciente> pacientes, List<Medico> medicos, List<Medicamento> medicamentos, List<Prescricao> prescricoes) {
        this.pacientes = pacientes;
        this.medicos = medicos;
        this.medicamentos = medicamentos;
        this.prescricoes = prescricoes;
    }

    /**
     * Cadastra um novo medicamento na lista de medicamentos.
     *
     * @param medicamento o medicamento a ser adicionado
     *
     * <p><b>Exemplo:</b></p>
     * <pre>
     *     manager.cadastrarMedicamento(new Medicamento("Amoxicilina", 500));
     * </pre>
     */
    public void cadastrarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
        System.out.println("Medicamento cadastrado com sucesso!");
    }

    /**
     * Busca um medicamento pelo nome (fórmula) na lista de medicamentos cadastrados.
     *
     * @param nome o nome (fórmula) do medicamento a ser buscado
     * @return {@code true} se o medicamento for encontrado, {@code false} caso contrário
     *
     * <p><b>Exemplo de uso:</b></p>
     * <pre>
     *     boolean encontrado = manager.buscarMedicamento("Ibuprofeno");
     *     // Saída: "Medicamento encontrado: Ibuprofeno"
     * </pre>
     */
    public boolean buscarMedicamento(String nome) {
        for (Medicamento m : medicamentos) {
            if (m.getFormula().equalsIgnoreCase(nome)) {
                System.out.println("Medicamento encontrado: " + m.getFormula());
                return true;
            }
        }
        System.out.println("Medicamento não encontrado: " + nome);
        return false;
    }

    /**
     * Busca um paciente pelo nome na lista de pacientes cadastrados.
     *
     * @param nome o nome do paciente a ser buscado
     * @return {@code true} se o paciente for encontrado, {@code false} caso contrário
     *
     * <p><b>Exemplo de uso:</b></p>
     * <pre>
     *     boolean achou = manager.buscarPacientePorNome("Ana Lima");
     *     // Saída: "Paciente encontrado: Ana Lima"
     * </pre>
     */
    public boolean buscarPacientePorNome(String nome) {
        for (Paciente p : pacientes) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Paciente encontrado: " + p.getNome());
                return true;
            }
        }
        System.out.println("Paciente não encontrado: " + nome);
        return false;
    }
}
