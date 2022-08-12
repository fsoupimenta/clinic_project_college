package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

class DentistaTest {

    @Test
    public void verifica_descricao() {
        Dentista d1 = new Dentista("Rafael da Silva",
                "rfsilva@email.com",
                "1111");
        Assertions.assertEquals(d1.getDescricao(), "Dr(a) Rafael da Silva " +
                "-Email: rfsilva@email.com -CRO: 1111");
    }
}