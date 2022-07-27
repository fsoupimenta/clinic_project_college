package model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PacienteTest {

    @Test
    void verifica_descricao() {
        Paciente p1 =
                new Paciente("Jose da Silva",
                        "jssilva@email.com",
                        LocalDate.of(2001, 04, 14));
        Assertions.assertEquals(p1.getDescricao(),"Sr(a) Jose da Silva " +
                "-Email:jssilva@email.com -Data de Nascimento: 14/04/2001");
    }
}
