package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Date;

@Target({
    ElementType.TYPE,
            ElementType.LOCAL_VARIABLE,
            ElementType.METHOD,
            ElementType.PARAMETER,
            ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface DevInfo {
    String name();
    String date();
    String role();
}
