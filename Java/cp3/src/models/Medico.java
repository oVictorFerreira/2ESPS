package models;

public class Medico {

    private String nomemed;
    private String crm;
    private String especialidade;

    public Medico(String nomemed, String crm, String especialidade) {
        this.nomemed = nomemed;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getNomemed() {
        return nomemed;
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void imprimirDados(){
        System.out.println("nome: " + nomemed);
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);
    }
}
