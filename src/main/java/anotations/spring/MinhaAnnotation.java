package anotations.spring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Define quando a anotação será retida (tempo de execução, compilação, ou fonte).
@Target(ElementType.METHOD) // Define onde a anotação pode ser usada (classe, método, atributo, etc.).
@interface MinhaAnnotation {
    String value();
}