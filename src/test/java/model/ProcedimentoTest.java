package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ProcedimentoTest {

    @Test
    public void verifica_descricao() {
        Procedimento x1 = new Procedimento("Tratamento de Canal", 499);
        Assertions.assertEquals(x1.getDescricao(), "Tratamento de Canal - Custo: 499.0");
    }
}