package model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProcedimentoTest {

    @Test
    void verifica_descricao() {
        Procedimento x1 =
                new Procedimento("Tratamento de Canal", 800);
        Assertions.assertEquals(x1.getDescricao(), "Tratamento de Canal -Preco: 800.0R$");
    }
}