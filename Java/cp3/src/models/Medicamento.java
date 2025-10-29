package models;

public class Medicamento {
    private String formula;
    private int dosagem;

    public Medicamento(String formula, int dosagem) {
        this.formula = formula;
        this.dosagem = dosagem;
    }

    public String getFormula() {
        return formula;
    }

    public int getDosagem() {
        return dosagem;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "dosagem=" + dosagem +
                '}';
    }

    void imprimirDados(){
        System.out.println("Medicamento: " + formula);
        System.out.println("Dosagem: " + dosagem );
    }
}
