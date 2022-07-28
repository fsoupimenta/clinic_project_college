package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;



class AgendaTest {

    DentistaAssalariado d1;
    Paciente p1;
    Procedimento x1;
    Consulta c1;
    Agenda a1;
    @BeforeEach
    public void init() {
        d1 =
                new DentistaAssalariado("Rafael da Silva",
                        "rfsilva@email.com",
                        "1111", 900, true);
        p1 = new Paciente("Jose da Silva",
                "jssilva@email.com",
                LocalDate.of(2001, 04, 14), true);
        x1 = new Procedimento("Tratamento de Canal", 499);
        c1 = new Consulta(d1, p1);
        c1.addProcedimento(x1);
        a1 = new Agenda();
        a1.addConsulta(c1);
    }

    @Test
    public void checkAmountConsult() {
        Assertions.assertEquals(a1.qtdConsultas(), 1);
    }

    @Test
    public void checkInvoicing() {
        Assertions.assertEquals(a1.getFaturamento(), 0);
    }

    @Test
    public void shouldExistConsult(){
        Assertions.assertEquals(a1.verificaConsulta(c1), true);
    }

    @Test
    public void shouldNotExistConsult(){
        a1.removeConsulta(c1);
        Assertions.assertEquals(a1.verificaConsulta(c1), false);
    }

}