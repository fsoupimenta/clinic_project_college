package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class DentistaAssalariadoTest {

    DentistaAssalariado dentista_I;
    @BeforeEach
    public void init() {
        dentista_I =
                new DentistaAssalariado("Rafael da Silva",
                        "rfsilva@email.com",
                        "1111", 900, true);
    }
    @Test
    public void checkDescription() {
        Assertions.assertEquals(dentista_I.getDescricao(), "Dr. Rafael da Silva " +
                "-Email: rfsilva@email.com -CRO: 1111");
    }

    @Test
    public void shouldReturnSalary(){
        Assertions.assertEquals(dentista_I.getSalario(), 900);
    }

}