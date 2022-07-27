package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class DentistaComissionadoTest {

    DentistaComissionado d1;
    @BeforeEach
    public void init() {
         d1 =
                new DentistaComissionado("Lucas da Silva",
                        "lcsilva@email.com",
                        "1112", 0.3);
    }
    @Test
        void verifica_descricao() {
        Assertions.assertEquals(d1.getDescricao(), "Dr(a): Lucas da Silva " +
                "-Email:lcsilva@email.com -CRO: 1112");
    }
}
