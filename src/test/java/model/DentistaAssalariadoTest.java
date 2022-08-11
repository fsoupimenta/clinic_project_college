package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class DentistaAssalariadoTest {

    DentistaAssalariado d1;
    @BeforeEach
    public void init() {
        d1 =
                new DentistaAssalariado("Rafael da Silva",
                        "rfsilva@email.com",
                        "1111", 900, true);
    }
    @Test
    public void checkDescription() {
        Assertions.assertEquals(d1.getDescricao(), "Dr. Rafael da Silva " +
                "-Email: rfsilva@email.com -CRO: 1111");
    }

    @Test
    public void shouldReturnSalary(){
        Assertions.assertEquals(d1.getSalario(), 900);
    }

}