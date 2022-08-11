package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;


class ConsultaTest {

    DentistaAssalariado d1;
    Paciente p1;
    Procedimento x1;
    Consulta c1;
    @BeforeEach
    public void init() {
        d1 =
                new DentistaAssalariado("Rafael da Silva",
                        "rfsilva@email.com",
                        "1111", 900, true);
        p1 =
                new Paciente("Jose da Silva",
                        "jssilva@email.com",
                        LocalDate.of(2001, 04, 14), true);
        x1 =
                new Procedimento("Tratamento de Canal", 800);
        c1 = new Consulta(d1, p1);
        c1.addProcedimento(x1);
    }

    @Test
    public void whenProcedureAdd_shouldCalculateConsult() {
        Assertions.assertEquals(c1.valorConsulta(), 800);
    }

    @Test
    public void checkDescription(){
        Assertions.assertEquals(c1.getDescricao(), "Tratamento de Canal," +
                " para o Senhor Silva realizada pelo/a " +
                "Dr. Rafael da Silva");
    }
}
