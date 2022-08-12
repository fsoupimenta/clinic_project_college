package model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PacienteTest {

    Paciente paciente_I;
    @BeforeEach
    public void init() {
        paciente_I =
                new Paciente("Jose da Silva",
                        "jssilva@email.com",
                        LocalDate.of(2001, 04, 14), true);
    }
    @Test
    public void checkDescription() {
        Assertions.assertEquals(paciente_I.getDescricao(),"Senhor Silva " +
                "-Email: jssilva@email.com -Data de Nascimento: 14/04/2001");
    }

    @Test
    public void checkTreatment(){
        Assertions.assertEquals(paciente_I.getTratamento(), "Senhor Silva");
    }
}
