package models;

/**
 * Representa um paciente no sistema.
 *
 * <p>Esta classe armazena as informações básicas de um paciente,
 * como nome, idade, e-mail e CPF.</p>
 *
 * <p><b>Exemplo de uso:</b></p>
 * <pre>
 *     Paciente paciente = new Paciente("João Pedro Santos", 13, "joao.pedro@outlook.com", "123.456.789-00");
 *     paciente.imprimirDados();
 * </pre>
 *
 * @author João Ferreira, Erick Cardoso, Gabrielly Candido, Luiza Saracol
 * @version 1.0
 */

public class Paciente {

    /** Nome completo do paciente. */
    private String nome;

    /** Idade do paciente. */
    private int idade;

    /** E-mail do paciente. */
    private String email;

    /** CPF do paciente. */
    private String cpf;

    /**
     * Constrói um novo objeto {@code Paciente} com as informações fornecidas.
     *
     * @param nome  o nome completo do paciente
     * @param idade a idade do paciente
     * @param email o e-mail do paciente
     * @param cpf   o CPF do paciente
     *
     * <p><b>Exemplo:</b></p>
     * <pre>
     *     Paciente paciente = new Paciente("João Pedro Santos", 13, "joao.pedro@outlook.com", "123.456.789-00");
     * </pre>
     */
    public Paciente(String nome, int idade, String email, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
    }

    /**
     * Retorna o nome do paciente.
     *
     * @return o nome do paciente
     *
     * <p><b>Exemplo de retorno:</b></p>
     * <pre>
     *     Paciente.getNome(); // "João Pedro Santos"
     * </pre>
     */
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idade=" + idade +
                '}';
    }

    /**
     * Retorna a idade do paciente.
     *
     * @return a idade do paciente
     *
     * <p><b>Exemplo de retorno:</b></p>
     * <pre>
     *     Paciente.getIdade(); // "13"
     * </pre>
     */
    public int getIdade() {
        return idade;

    }

    /**
     * Retorna o e-mail do paciente.
     *
     * @return o e-mail do paciente
     *
     * <p><b>Exemplo de retorno:</b></p>
     * <pre>
     *     medico.getPaciente(); // "joao.pedro@outlook.com"
     * </pre>
     */
    public String getEmail() {
        return email;
    }

    /**
     * Retorna o CPF do paciente.
     *
     * @return o CPF do paciente
     *
     * <p><b>Exemplo de retorno:</b></p>
     * <pre>
     *     medico.getCpf(); // "123.456.789-00"
     * </pre>
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Imprime no console os dados completos do paciente.
     *
     * <p>Exibe o nome, CPF, idade e e-mail formatados.</p>
     *
     * <p><b>Exemplo de saída:</b></p>
     * <pre>
     * Nome: João Pedro Santos
     * CPF: 123.456.789-00
     * Idade: 13
     * E-mail: joao.pedro@outlook.com
     * </pre>
     */
    void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("E-mail: " + email);
    }


}
