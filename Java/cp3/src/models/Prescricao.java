package models;
import models.Medicamento;
import models.Paciente;
import models.Medico;

public class Prescricao {
    private String cid;
    private String data;
    private Medico medico;
    private Paciente paciente;
    private Medicamento medicamento;

    public Prescricao(String cid, String data, Medico medico, Paciente paciente, Medicamento medicamento) {
        this.cid = cid;
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
        this.medicamento = medicamento;
    }

    public void gerarPrescricao() {
        System.out.println("---- PRESCRIÇÃO MÉDICA ----");
        System.out.println("São Paulo, " + data);
        System.out.println("Dr. " + medico.getNomemed() + " - CRM: " + medico.getCrm());
        System.out.println("-----------------------------");
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("CID: " + cid);
        System.out.println("Receita médica: " + medicamento.getFormula() + " " + medicamento.getDosagem() + "mg");
        System.out.println("-----------------------------\n");

        if (medico == null || paciente == null || medicamento == null) {
            System.out.println("❌ Não foi possível criar a prescrição. Verifique os dados informados.");
            return;
        }
    }
}
