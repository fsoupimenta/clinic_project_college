package model;
import api.ClassificaPaciente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;



class AgendaTest {

    DentistaComissionado d1;
    Paciente p1;
    Procedimento x1;
    Consulta c1;
    Agenda a1;
    @BeforeEach
    public void init() {
        d1 =
                new DentistaComissionado("Rafael da Silva",
                        "rfsilva@email.com",
                        "1111", 0.3, true);
        p1 = new Paciente("Jose da Silva",
                "jssilva@email.com",
                LocalDate.of(2001, 04, 14), true);
        x1 = new Procedimento("Tratamento de Canal", 4500);
        c1 = new Consulta(d1, p1);
        c1.addProcedimento(x1);
        a1 = new Agenda();
        a1.addConsulta(c1);
    }

    @Test
    public void checkAmountConsult() {
        Assertions.assertEquals(a1.qtdConsultas(), 1);
    }

    @Test
    public void checkInvoicing() {
        Assertions.assertEquals(a1.getFaturamento(), 0);
    }

    @Test
    public void shouldExistConsult(){
        Assertions.assertEquals(a1.verificaConsulta(c1), true);
    }

    @Test
    public void shouldNotExistConsult(){
        a1.removeConsulta(c1);
        Assertions.assertEquals(a1.verificaConsulta(c1), false);
    }

    @Test
    public void shouldShow_NumberOfConsults(){
        Assertions.assertEquals(a1.qtdConsultas(), 1);
    }

    @Test
    public void calculaGastos(){
        Assertions.assertEquals(Agenda.calculaValorAoPaciente(p1),
                34499);
    }

    @Test
    public void calculaComissao(){
        Assertions.assertEquals(d1.getSalario(),
                10349.699999999999);
    }

    @Test
    public void shouldOrderByPacientNameAZ(){
        Paciente p2 = new Paciente("Bruno da Silva",
                "jssilva@email.com",
                LocalDate.of(2001, 04, 14), true);
        Consulta c2 = new Consulta(d1, p2);
        Paciente p3 = new Paciente("Alex", "a",
                LocalDate.of(2001, 04, 18), true);
        Consulta c3 = new Consulta(d1, p3);
        c3.addProcedimento(x1);
        c2.addProcedimento(x1);
        a1.addConsulta(c2);
        a1.addConsulta(c3);
        Assertions.assertEquals(a1.ordenaNomePaciente(), "Alex " + "Bruno da Silva "+
                "Jose da Silva ");
    }

    @Test
    public void shouldOrderByDentistNameZA(){
        DentistaComissionado d2 =
                new DentistaComissionado("Saulo da Silva",
                        "rfsilva@email.com",
                        "1111", 0.3, true);
        Consulta c2 = new Consulta(d2, p1);
        DentistaComissionado d3 =
                new DentistaComissionado("Wendel da Silva",
                        "rfsilva@email.com",
                        "1111", 0.3, true);
        Consulta c3 = new Consulta(d3, p1);
        c3.addProcedimento(x1);
        c2.addProcedimento(x1);
        a1.addConsulta(c2);
        a1.addConsulta(c3);
        Assertions.assertEquals(a1.getListaOrdemDentista(), "Wendel da Silva " + "Saulo da Silva " +
                "Rafael da Silva ");
    }

    @Test
    public void shouldReturnB(){
        ClassificaPaciente.classificaPaciente(p1);
        Assertions.assertEquals(ClassificaPaciente.getClassificacao(p1.getNome()), "A");
    }
}