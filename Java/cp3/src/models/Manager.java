package models.models;

import models.Medicamento;
import models.Medico;
import models.Paciente;
import models.Prescricao;
import java.util.List;

public class Manager {

    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<Medicamento> medicamentos;
    private List<Prescricao> prescricoes;

    public Manager(List<Paciente> pacientes, List<Medico> medicos, List<Medicamento> medicamentos, List<Prescricao> prescricoes) {
        this.pacientes = pacientes;
        this.medicos = medicos;
        this.medicamentos = medicamentos;
        this.prescricoes = prescricoes;
    }

    // CADASTRAR MEDICAMENTO
    public void cadastrarMedicamento(Medicamento medicamento) {

        medicamentos.add(medicamento);
        System.out.println("Medicamento cadastrado com sucesso!");
    }

    // BUSCAR MEDICAMENTO

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

    // BUSCAR PACIENTE POR NOME
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
