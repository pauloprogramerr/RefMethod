package anotations.jpa;

import javax.persistence.Embeddable;


@Embeddable
public class Endereco {
    private String rua;
    private String cidade;
}
