package model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProcedimentoTest {

    @Test
    public void checkDescription() {
        Procedimento procedimento_I =
                new Procedimento("Tratamento de Canal", 800);
        Assertions.assertEquals(procedimento_I.getDescricao(), "Tratamento de Canal -Preco: 800.0R$");
    }
}