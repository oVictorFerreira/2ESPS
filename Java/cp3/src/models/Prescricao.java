package models;

import models.Medicamento;
import models.Paciente;
import models.Medico;

/**
 * Representa uma prescrição médica emitida por um médico para um paciente.
 *
 * <p>Contém informações sobre o CID (Classificação Internacional de Doenças),
 * data da prescrição, o médico responsável, o paciente e o medicamento prescrito.</p>
 *
 * <p><b>Exemplo de uso:</b></p>
 * <pre>
 *     Medico medico = new Medico("Carlos Souza", "98765-SP", "Clínico Geral");
 *     Paciente paciente = new Paciente("Ana Lima", 29, "ana.lima@email.com", "321.654.987-00");
 *     Medicamento medicamento = new Medicamento("Paracetamol", 500);
 *
 *     Prescricao prescricao = new Prescricao("J00", "29/10/2025", medico, paciente, medicamento);
 *     prescricao.gerarPrescricao();
 * </pre>
 *
 * @author João Ferreira, Erick Cardoso, Gabrielly Candido, Luiza Saracol
 * @version 1.0
 */
public class Prescricao {

    /** Código CID (Classificação Internacional de Doenças) associado à prescrição. */
    private String cid;

    /** Data da emissão da prescrição. */
    private String data;

    /** Médico responsável pela prescrição. */
    private Medico medico;

    /** Paciente que receberá o medicamento. */
    private Paciente paciente;

    /** Medicamento prescrito. */
    private Medicamento medicamento;

    /**
     * Constrói um novo objeto {@code Prescricao} com as informações fornecidas.
     *
     * @param cid         o código CID da condição do paciente
     * @param data        a data de emissão da prescrição
     * @param medico      o médico responsável pela prescrição
     * @param paciente    o paciente que receberá o medicamento
     * @param medicamento o medicamento prescrito
     *
     * <p><b>Exemplo:</b></p>
     * <pre>
     *     Prescricao p = new Prescricao("A09", "10/11/2025", medico, paciente, medicamento);
     * </pre>
     */
    public Prescricao(String cid, String data, Medico medico, Paciente paciente, Medicamento medicamento) {
        this.cid = cid;
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
        this.medicamento = medicamento;
    }

    /**
     * Gera e exibe no console o texto completo da prescrição médica.
     *
     * <p>Verifica se os objetos {@code medico}, {@code paciente} e {@code medicamento}
     * estão corretamente definidos antes de gerar a prescrição.</p>
     *
     * <p><b>Exemplo de saída:</b></p>
     * <pre>
     * ---- PRESCRIÇÃO MÉDICA ----
     * São Paulo, 29/10/2025
     * Dr. Carlos Souza - CRM: 98765-SP
     * -----------------------------
     * Paciente: Ana Lima
     * CID: J00
     * Receita médica: Paracetamol 500mg
     * -----------------------------
     * </pre>
     *
     * <p>Se algum dos dados obrigatórios estiver ausente, uma mensagem de erro será exibida.</p>
     */
    public void gerarPrescricao() {
        if (medico == null || paciente == null || medicamento == null) {
            System.out.println("Não foi possível criar a prescrição. Verifique os dados informados.");
            return;
        }

        System.out.println("---- PRESCRIÇÃO MÉDICA ----");
        System.out.println("São Paulo, " + data);
        System.out.println("Dr. " + medico.getNomemed() + " - CRM: " + medico.getCrm());
        System.out.println("-----------------------------");
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("CID: " + cid);
        System.out.println("Receita médica: " + medicamento.getFormula() + " " + medicamento.getDosagem() + "mg");
        System.out.println("-----------------------------\n");
    }
}
