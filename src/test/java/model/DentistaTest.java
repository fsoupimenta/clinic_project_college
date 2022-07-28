package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class DentistaTest {

    Dentista d1;
    @BeforeEach
    public void init(){
        d1 = new Dentista("Rafael da Silva",
                "rfsilva@email.com",
                "1111");
    }

    @Test
    public void verifica_descricao(){
        Assertions.assertEquals(d1.getDescricao(), "Dr(a) Rafael da Silva " +
                "-Email: rfsilva@email.com -CRO: 1111");
    }

    @Test
    public void verifica_codigo(){
        Assertions.assertEquals(d1.getCodigo(), "DE1");
    }
}