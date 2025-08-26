//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando objetos
        // Tutores

        Tutor tutorA = new Tutor();
        Tutor tutorB = new Tutor();

        // Colocando características dos objetos

        // Tutores
        tutorA.nome = "Joaquim José";
        tutorA.idade = 44;
        tutorA.cpf = "111.111.111-08";

        tutorB.nome = "Helena Rafaela";
        tutorB.idade = 44;
        tutorB.cpf = "222.222.222-18";

        // Pets
        Pet petA = new Pet();
        Pet petB = new Pet();
        Pet petC = new Pet();
        Pet petD = new Pet();

        petA.id = 1;
        petA.nome = "Caramelo";
        petA.raca = "Vira Lata";
        petA.cor = "Amarela";
        petA.idade = 8;

        petB.id = 2;
        petB.nome = "Xuxa";
        petB.raca = "Dálmata";
        petB.cor = "Branca";
        petB.idade = 3;

        petC.id = 3;
        petC.nome = "Lola";
        petC.raca = "Golden Retriever";
        petC.cor = "Amarela";
        petC.idade = 4;

        petD.id = 4;
        petD.nome = "Bolinha";
        petD.raca = "Pinscher";
        petD.cor = "Preta";
        petD.idade = 12;


        tutorA.imprimirDados();
        tutorB.imprimirDados();

        petA.imprimirDados();
        petB.imprimirDados();
        petC.imprimirDados();
        petD.imprimirDados();

        // João Victor da Silva Ferreira

    }
}