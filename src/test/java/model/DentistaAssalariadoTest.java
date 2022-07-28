package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class DentistaAssalariadoTest {

    DentistaAssalariado d1;
    @BeforeEach
    public void init() {
        d1 = new DentistaAssalariado("Rafael da Silva",
                        "rfsilva@email.com",
                        "1111", 900);
    }
    @Test
    public void verifica_descricao() {
        Assertions.assertEquals(d1.getDescricao(), "Dr(a): Rafael da Silva " +
                "-Email:rfsilva@email.com -CRO: 1111");
    }
    @Test
    public void verifica_salario(){
        Assertions.assertEquals(d1.getSalario(), 900);
    }
}