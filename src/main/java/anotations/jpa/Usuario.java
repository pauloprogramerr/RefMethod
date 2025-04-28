package anotations.jpa;

/*
 * @Entity: Marca uma classe como uma entidade do banco de dados.
 * @Table: Configura a tabela correspondente à entidade.
 * @Id: Define o identificador único.
 * @Column: Configura uma coluna específica.
 * @OneToMany, @ManyToOne, @OneToOne, @ManyToMany Mapeiam os relacionamentos entre as entidades.
 * @JoinColumn Especifica a coluna de junção para relacionamentos.
 * @Transient Indica que o atributo não deve ser persistido no banco de dados.
 * @Embedded e @Embeddable Usadas para incorporar uma classe dentro de outra como parte do mapeamento.
 *
 */

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome completo", nullable = false)
    private String name;

    @Transient
    private String senhaTemporaria;

    @Column(unique = true)
    private String email;

    @Embedded
    private Endereco endereco;

    @OneToMany
    private List<Pedidos> pedidos;
}

@Entity
class Pedidos {

    @Id

    private long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}

@Embeddable
class Endereco {

    private String rua;
    private String cidade;
}