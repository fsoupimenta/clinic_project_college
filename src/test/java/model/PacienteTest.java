package model;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PacienteTest {

    Paciente p1;
    @BeforeEach
    public void init(){
        p1 = new Paciente("Jose da Silva",
                "jssilva@email.com",
                LocalDate.of(2001, 04, 14));
    }

    @Test
    public void verifica_descricao() {
        Assertions.assertEquals(p1.getDescricao(), "Sr(a) Jose da Silva " +
                "-Data de Nascimento: 14/04/2001 -Email: jssilva@email.com");
    }

    @Test
    public void verifica_codigo(){
        Assertions.assertEquals(p1.getCodigo(), " P1");
    }

    @AfterEach
    public void cleanUp(){
        Dentista.setContador(1);
        Paciente.setContador(1);
        Procedimento.setContador(1);
    }
}