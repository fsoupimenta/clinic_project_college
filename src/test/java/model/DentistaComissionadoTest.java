package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;


class DentistaComissionadoTest {

    DentistaComissionado d1;
    @BeforeEach
    public void init() {
         d1 =
                new DentistaComissionado("Lucas da Silva",
                        "lcsilva@email.com",
                        "1112", 0.3);
    }
    @Test
        void verifica_descricao() {
        Assertions.assertEquals(d1.getDescricao(), "Dr(a): Lucas da Silva " +
                "-Email:lcsilva@email.com -CRO: 1112");
    }

    @Test
    public void verifica_salario(){
        Paciente p1 =
                new Paciente("Jose da Silva",
                        "jssilva@email.com",
                        LocalDate.of(2001, 04, 14));
        Procedimento x1 =
                new Procedimento("Tratamento de Canal", 800);
        Consulta c1 = new Consulta(d1, p1);
        c1.addProcedimento(x1);
        Assertions.assertEquals(d1.getSalario(), 240);
    }
}
