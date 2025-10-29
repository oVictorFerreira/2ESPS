package models;

/**
 * Representa um médico no sistema.
 *
 * <p>Esta classe contém as informações principais de um médico,
 * incluindo seu nome, CRM (registro profissional) e especialidade.</p>
 *
 * <p>Exemplo de uso:</p>
 * <pre>
 *     Medico medico = new Medico("João Silva", "12345-SP", "Cardiologia");
 *     medico.imprimirDados();
 * </pre>
 *
 * @author João Ferreira, Erick Cardoso, Gabrielly Candido, Luiza Saracol
 * @version 1.0
 */

public class Medico {

    /** Nome completo do médico. */
    private String nomemed;

    /** Número do CRM do médico. */
    private String crm;

    /** E-mail do médico */
    private String email;

    /** Especialidade médica do profissional. */
    private String especialidade;

    /**
     * Constrói um novo objeto {@code Medico} com os dados informados.
     *
     * @param nomemed       o nome completo do médico
     * @param crm           o número de registro CRM do médico
     * @param especialidade a especialidade do médico
     *
     * <p><b>Exemplo:</b></p>
     * <pre>
     *     Medico medico = new Medico("João Silva", "12345-SP", "Cardiologia");
     * </pre>
     */
    public Medico(String nomemed, String crm, String especialidade, String email) {
        this.nomemed = nomemed;
        this.crm = crm;
        this.especialidade = especialidade;
        this.email = email;
    }

    /**
     * Retorna o nome do médico.
     *
     * @return o nome do médico
     *
     * <p><b>Exemplo de retorno:</b></p>
     * <pre>
     *     medico.getNomemed(); // "João Silva"
     * </pre>
     */
    public String getNomemed() {
        return nomemed;
    }

    /**
     * Retorna o número de CRM do médico.
     *
     * @return o CRM do médico
     *
     * <p><b>Exemplo de retorno:</b></p>
     * <pre>
     *     medico.getCrm(); // "12345-SP"
     * </pre>
     */
    public String getCrm() {
        return crm;
    }

    /**
     * Retorna a especialidade do médico.
     *
     * @return a especialidade do médico
     *
     * <p><b>Exemplo de retorno:</b></p>
     * <pre>
     *     medico.getEspecialidade(); // "Cardiologia"
     * </pre>
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * Retorna o e-mail do médico.
     *
     * @return o e-mail do médico
     *
     * <p><b>Exemplo de retorno:</b></p>
     * <pre>
     *     medico.getEmail(); // "joao.silva@hospitalsantoantonio.com.br"
     * </pre>
     */
    public String getEmail() {
        return email;
    }

    /**
     * Imprime no console os dados do médico de forma formatada.
     *
     * <p>Exibe o nome, CRM e especialidade do profissional.</p>
     *
     * <p><b>Exemplo de saída:</b></p>
     * <pre>
     * Nome: João Silva
     * CRM: 12345-SP
     * Especialidade: Cardiologia
     * E-mail: Joao.silva@hospitalsantoantonio.com.br
     * </pre>
     */
    public void imprimirDados(){
        System.out.println("Nome: " + nomemed);
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("E-mail: " + email);
    }
}
