package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;


class ConsultaTest {

    DentistaAssalariado dentista_I;
    Paciente paciente_I;
    Procedimento procedimento_I;
    Consulta consulta_I;
    @BeforeEach
    public void init() {
        dentista_I =
                new DentistaAssalariado("Rafael da Silva",
                        "rfsilva@email.com",
                        "1111", 900, true);
        paciente_I =
                new Paciente("Jose da Silva",
                        "jssilva@email.com",
                        LocalDate.of(2001, 04, 14), true);
        procedimento_I =
                new Procedimento("Tratamento de Canal", 800);
        consulta_I = new Consulta(dentista_I, paciente_I);
        consulta_I.addProcedimento(procedimento_I);
    }

    @Test
    public void whenProcedureAdd_shouldCalculateConsult() {
        Assertions.assertEquals(consulta_I.valorConsulta(), 800);
    }

    @Test
    public void checkDescription(){
        Assertions.assertEquals(consulta_I.getDescricao(), "Tratamento de Canal," +
                " para o Senhor Silva realizada pelo/a " +
                "Dr. Rafael da Silva");
    }
}
