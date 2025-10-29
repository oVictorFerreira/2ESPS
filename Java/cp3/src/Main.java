package models;
import models.Paciente;
import models.Medico;
import models.Prescricao;
import models.Medicamento;


public class Main {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente(
                "João Silva",
                25,
                "joao.silva@gmail.com",
                "123.456.789-00"
        );

        Medico medico1 = new Medico(
                "Carlos Mendes",
                "2550",
                "Pediatria",
                "carlos.mendes@Gmail.com"
        );

        Medicamento dipirona = new Medicamento(
                "Dipirona Monoidratada",
                500
        );

        Prescricao prescricao1 = new Prescricao(
                "J00",
                "29/10/2025",
                medico1,
                paciente1,
                dipirona
        );

        paciente1.imprimirDados();
        System.out.println();
        medico1.imprimirDados();
        System.out.println();
        dipirona.imprimirDados();
        System.out.println();

        prescricao1.gerarPrescricao();
    }
}
