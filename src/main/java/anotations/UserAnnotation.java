package anotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME) // Define quando a anotação será retida (tempo de execução, compilação, ou fonte).
@Target(ElementType.METHOD) // Define onde a anotação pode ser usada (classe, método, atributo, etc.).
@interface MinhaAnotacao {
    String value();
}


class Usuário {

    @MinhaAnotacao(value = "teste") // Exemplo de uso da anotação personalizada.
    public void metodoExemplo() {
        System.out.println("método anotado");
    }
}