import annotations.DevInfo;
import annotations.Done;
import annotations.InProgress;
import annotations.Todo;

@InProgress(descricao = "Falta realizar toString")
@DevInfo(name = "João", date= "28/04", role = "aaaaa")
public class Carro {
    private String motor;
    private String cor;
    private String modelo;

    public Carro(String motor, String cor, String modelo) {
        this.motor = motor;
        this.cor = cor;
        this.modelo = modelo;
    }

    @Done(descricao = "Getter e Setters feitos")
    public String getMotor() {
        return motor;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }


}
