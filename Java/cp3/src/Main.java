package models;

public class Main {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente(
                "João Silva",
                25,
                "joao.silva@gmail.com",
                "123.456.789-00"
        );

        Medico medico1 = new Medico(
                "João Silva",
                "2550",
                "joao.silva@gmail.com"
        );

        Medicamento dipirona = new Medicamento(
                "Dipirona Monohidratada",
                3
        );

        paciente1.imprimirDados();
        medico1.imprimirDados();
        dipirona.imprimirDados();

        System.out.println("O médico "+medico1.getNomemed() + " receitou ao paciente "+ paciente1.getNome()+ "\n o medicamento "+ dipirona.getFormula() +" " + dipirona.getDosagem() +"mg");

    }
}