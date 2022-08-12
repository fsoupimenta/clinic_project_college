package model;
import org.junit.jupiter.api.*;

import java.time.LocalDate;



class AgendaTest {

    Dentista d1;
    Paciente p1;
    Procedimento x1;
    Consulta c1;
    Agenda a1;
    @BeforeEach
    public void init() {
        d1 = new Dentista("Rafael da Silva",
                "rfsilva@email.com",
                "1111");
        p1 = new Paciente("Jose da Silva",
                "jssilva@email.com",
                LocalDate.of(2001, 04, 14));
        x1 = new Procedimento("Tratamento de Canal", 499);
        c1 = new Consulta(d1, p1, x1);
        a1 = new Agenda(1);
        a1.addConsulta(c1);
    }

    @Test
    public void verifica_quantidade_consulta() {
        Assertions.assertEquals(a1.qtdConsultas(), 1);
    }

    @Test
    public void verifica_faturamento() {
        Assertions.assertEquals(a1.calculaFaturamento(), 499);
    }

    @AfterEach
    public void cleanUp(){
        Dentista.setContador(1);
        Paciente.setContador(1);
        Procedimento.setContador(1);
    }
}