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
   public void whenConsultCreate_shouldCalculateSalary(){
       Paciente p1 =
               new Paciente("Jose da Silva",
                       "jssilva@email.com",
                       LocalDate.of(2001, 04, 14), true);
       Procedimento x1 =
               new Procedimento("Tratamento de Canal", 800);
       Consulta c1 = new Consulta(d1, p1);
       c1.addProcedimento(x1);
       Assertions.assertEquals(d1.getSalario(), 240);
   }

    @Test
    public void shouldFailSetPorcentagemComissao_maxLimit(){
        assertThrows(ErroComissao.class, ()->{
           d1.setPorcentagemComissao(0.51);
        });
    }

    @Test
    public void shouldNotFailSetPorcentagemComissao_maxLimit(){
        Assertions.assertEquals(d1.setPorcentagemComissao(0.5), true);
    }

    @Test
    public void shouldFailSetPorcentagemComissao_minLimit(){
        assertThrows(ErroComissao.class, ()->{
           d1.setPorcentagemComissao(-0.01);
        });
    }

   @Test
    public void shouldNotFailSetPorcentagemComissao_minLimit(){
        Assertions.assertEquals(d1.setPorcentagemComissao(0), true);
    }

}
