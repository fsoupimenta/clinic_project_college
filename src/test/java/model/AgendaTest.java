package model;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class AgendaTest {

    @Test
    void verifica_qtdConsultas() {
        Agenda a1 = new Agenda();
        Assertions.assertEquals(a1.qtdConsultas(), 0);
    }
}