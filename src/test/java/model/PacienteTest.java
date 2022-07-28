package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PacienteTest {

    @Test
    public void verifica_descricao() {
        Paciente p1 = new Paciente("Jose da Silva",
                "jssilva@email.com",
                LocalDate.of(2001, 04, 14));
        Assertions.assertEquals(p1.getDescricao(), "Sr(a) Jose da Silva " +
                "-Data de Nascimento: 14/04/2001 -Email: jssilva@email.com");
    }
}