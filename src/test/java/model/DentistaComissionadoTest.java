package model;
import exceptions.ErroComissao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class DentistaComissionadoTest {

    DentistaComissionado dentista_I;
    @BeforeEach
    public void init() {
        dentista_I =
                new DentistaComissionado("Lucia da Silva",
                        "lcsilva@email.com",
                        "1112", 0.3, false);
    }
    @Test
    public void checkDescription() {
        Assertions.assertEquals(dentista_I.getDescricao(), "Dra. Lucia da Silva " +
                "-Email: lcsilva@email.com -CRO: 1112");
    }

    @Test
    public void shouldFailSetPorcentagemComissao_maxLimit(){
        assertThrows(ErroComissao.class, ()->{
           dentista_I.setPorcentagemComissao(0.51);
        });
    }

    @Test
    public void shouldNotFailSetPorcentagemComissao_maxLimit() throws ErroComissao{
        Assertions.assertEquals(dentista_I.setPorcentagemComissao(0.5), true);
    }

    @Test
    public void shouldFailSetPorcentagemComissao_minLimit(){
        assertThrows(ErroComissao.class, ()->{
           dentista_I.setPorcentagemComissao(-0.01);
        });
    }

   @Test
    public void shouldNotFailSetPorcentagemComissao_minLimit() throws ErroComissao{
        Assertions.assertEquals(dentista_I.setPorcentagemComissao(0), true);
    }

    @Test
    public void shouldReturnSalary(){
        Paciente paciente_I = new Paciente("Jose da Silva",
                "jssilva@email.com",
                LocalDate.of(2001, 04, 14), true);
        Procedimento procedimento_I = new Procedimento("Tratamento de Canal", 45000);
        Consulta consulta_I = new Consulta(dentista_I, paciente_I);
        consulta_I.addProcedimento(procedimento_I);
        Agenda agenda_I = new Agenda();
        agenda_I.addConsulta(consulta_I);
        Assertions.assertEquals(dentista_I.getSalario(), 13500);
    }
}
