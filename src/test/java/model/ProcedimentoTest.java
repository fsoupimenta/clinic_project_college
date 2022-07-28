package model;
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
        Assertions.assertEquals(x1.getDescricao(), "Tratamento de Canal -Preco: 499.0R$");
    }
}