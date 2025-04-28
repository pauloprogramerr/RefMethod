package anotations.junit;

import org.junit.jupiter.api.*;

/*
 * @Test: Marca um método como um caso de teste.
 * @BeforeEach e @AfterEach: Executam código antes ou depois de cada teste.
 */
public class CalculadoraTest {

    @BeforeEach
    public void configurar() {
        System.out.println("Configurando teste");
    }

    @Test
    public void testSoma () {
        int resultado = 2 + 4;
        Assertions.assertEquals(4, resultado);
    }

    @AfterEach
    public void finalizar () {
        System.out.println ("teste concluido");
    }
}
