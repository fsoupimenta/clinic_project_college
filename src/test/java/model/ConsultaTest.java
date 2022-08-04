package model;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;


class ConsultaTest {

    @Test
    public void whenProcedureAdd_shouldCalculateConsult(){
        DentistaAssalariado d1 =
                new DentistaAssalariado("Rafael da Silva",
                        "rfsilva@email.com",
                        "1111", 900, true);
        Paciente p1 =
                new Paciente("Jose da Silva",
                        "jssilva@email.com",
                        LocalDate.of(2001, 04, 14), true);
        Procedimento x1 =
                new Procedimento("Tratamento de Canal", 800);
        Consulta c1 = new Consulta(d1, p1);
        c1.addProcedimento(x1);
        Assertions.assertEquals(c1.valorConsulta(), 800);
    }
}