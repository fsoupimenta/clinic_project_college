package model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PacienteTest {

    Paciente p1;
    @BeforeEach
    public void init() {
        p1 =
                new Paciente("Jose da Silva",
                        "jssilva@email.com",
                        LocalDate.of(2001, 04, 14), true);
    }
    @Test
    public void checkDescription() {
        Assertions.assertEquals(p1.getDescricao(),"Senhor Silva " +
                "-Email: jssilva@email.com -Data de Nascimento: 14/04/2001");
    }

    @Test
    public void checkTreatment(){
        Assertions.assertEquals(p1.getTratamento(), "Senhor Silva");
    }
}
