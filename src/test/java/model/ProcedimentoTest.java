package model;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ProcedimentoTest {

    Procedimento x1;
    @BeforeEach
    public void init(){
        x1 = new Procedimento("Tratamento de Canal", 499);
    }

    @Test
    public void verifica_descricao() {
        Assertions.assertEquals(x1.getDescricao(), "Tratamento de Canal - Custo: 499.0");
    }

    @Test
    public void verifica_codigo(){
        Assertions.assertEquals(x1.getCodigo(), "PO1");
    }

    @AfterEach
    public void cleanUp(){
        Dentista.setContador(1);
        Paciente.setContador(1);
        Procedimento.setContador(1);
    }
}