package annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Estruturas @interface dão origem a novas annotations
@Target({ElementType.TYPE,
        ElementType.LOCAL_VARIABLE,
        ElementType.METHOD,
        ElementType.PARAMETER,
        ElementType.FIELD})

@Retention(RetentionPolicy.SOURCE)
public @interface Todo {
    //Criando um membro para a nossa annotation
    //Podemos ter quantos membros forem necessários

    String descricao();
}
