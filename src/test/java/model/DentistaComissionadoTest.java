package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class DentistaComissionadoTest {

    DentistaComissionado d1;
    @BeforeEach
    public void init() {
        d1 =
                new DentistaComissionado("Lucia da Silva",
                        "lcsilva@email.com",
                        "1112", 0.3, false);
    }
    @Test
        void verifica_Descricao() {
        Assertions.assertEquals(d1.getDescricao(), "Dr(a): Lucas da Silva " +
                "-Email:lcsilva@email.com -CRO: 1112");
    }

    @Test
       void whenExceptionThrows_thrownEqualsTrue(){
        assertThrows(ErroComissao.class, ()->{
           d1.setPorcentagemComissao(0.6);
           d1.setPorcentagemComissao(0.7);
        });
    }


}
