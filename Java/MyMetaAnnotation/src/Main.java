import annotations.Todo;

@Todo(descricao = "Criar todo o metodo main")
public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        String nomeA = "Jose Abelardo Barbosa";
        //nomeA="Outro nome";

        @SuppressWarnings("SpellCheckingInspection")
        String nomeB = "Jose Abelardo Barbosa";

        @SuppressWarnings("all")
        String nomeC = "Jose Abelardo Barbosa";


    }

    @Override
    public String toString() {
        return "Main{}";
    }
}