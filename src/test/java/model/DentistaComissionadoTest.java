package model;
import exceptions.ErroComissao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

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
    public void checkDescription() {
        Assertions.assertEquals(d1.getDescricao(), "Dra. Lucia da Silva " +
                "-Email: lcsilva@email.com -CRO: 1112");
    }

    @Test
    public void shouldFailSetPorcentagemComissao_maxLimit(){
        assertThrows(ErroComissao.class, ()->{
           d1.setPorcentagemComissao(0.51);
        });
    }

    @Test
    public void shouldNotFailSetPorcentagemComissao_maxLimit() throws ErroComissao{
        Assertions.assertEquals(d1.setPorcentagemComissao(0.5), true);
    }

    @Test
    public void shouldFailSetPorcentagemComissao_minLimit(){
        assertThrows(ErroComissao.class, ()->{
           d1.setPorcentagemComissao(-0.01);
        });
    }

   @Test
    public void shouldNotFailSetPorcentagemComissao_minLimit() throws ErroComissao{
        Assertions.assertEquals(d1.setPorcentagemComissao(0), true);
    }

}
