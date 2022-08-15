package model;
import api.ClassificaPaciente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;



class AgendaTest {

    DentistaComissionado dentista_I;
    Paciente paciente_I;
    Procedimento procedimento_I;
    Consulta consulta_I;
    Agenda agenda_I;
    @BeforeEach
    public void init() {
        dentista_I =
                new DentistaComissionado("Rafael da Silva",
                        "rfsilva@email.com",
                        "1111", 0.3, true);
        paciente_I = new Paciente("Jose da Silva",
                "jssilva@email.com",
                LocalDate.of(2001, 04, 14), true);
        procedimento_I = new Procedimento("Tratamento de Canal", 45000);
        consulta_I = new Consulta(dentista_I, paciente_I);
        consulta_I.addProcedimento(procedimento_I);
        agenda_I = new Agenda();
        agenda_I.esvaziaLista();
        agenda_I.addConsulta(consulta_I);
    }

    @Test
    public void checkAmountConsult() {
        Assertions.assertEquals(agenda_I.qtdConsultas(), 1);
    }

    @Test
    public void checkInvoicing() {
        Assertions.assertEquals(agenda_I.getFaturamento(), 0);
    }

    @Test
    public void shouldExistConsult(){
        Assertions.assertEquals(agenda_I.verificaConsulta(consulta_I), true);
    }

    @Test
    public void shouldNotExistConsult(){
        agenda_I.removeConsulta(consulta_I);
        Assertions.assertEquals(agenda_I.verificaConsulta(consulta_I), false);
    }

    @Test
    public void shouldReturnPatientExpense(){
        Assertions.assertEquals(Agenda.totalizaValorAoPaciente(paciente_I),
                45000.0);
    }

    @Test
    public void shoulReturnDentistExpense(){
        Assertions.assertEquals(Agenda.totalizaValorAoDentista(dentista_I),
                45000.0);
    }

    @Test
    public void shouldOrderByPacientNameAZ(){
        Paciente paciente_II = new Paciente("Bruno da Silva",
                "jssilva@email.com",
                LocalDate.of(2001, 04, 14), true);
        Consulta consulta_II = new Consulta(dentista_I, paciente_II);
        Paciente paciente_III = new Paciente("Alex", "a",
                LocalDate.of(2001, 04, 18), true);
        Consulta consulta_III = new Consulta(dentista_I, paciente_III);
        consulta_III.addProcedimento(procedimento_I);
        consulta_II.addProcedimento(procedimento_I);
        agenda_I.addConsulta(consulta_II);
        agenda_I.addConsulta(consulta_III);
        Assertions.assertEquals(agenda_I.getListaOrdemPaciente(), "Alex" +
                "\nValor para o doutor: 40500.0"+ "\nValor para Clinica: 94500.0" +
                "\nBruno da Silva" + "\nValor para o doutor: 40500.0" +
                "\nValor para Clinica: 94500.0" + "\nJose da Silva" +
                "\nValor para o doutor: 40500.0" + "\nValor para Clinica: 94500.0\n");
    }

    @Test
    public void shouldOrderByDentistNameZA(){
        DentistaComissionado dentista_II =
                new DentistaComissionado("Saulo da Silva",
                        "rfsilva@email.com",
                        "1111", 0.3, true);
        Consulta consulta_II = new Consulta(dentista_II, paciente_I);
        DentistaComissionado dentista_III =
                new DentistaComissionado("Wendel da Silva",
                        "rfsilva@email.com",
                        "1111", 0.3, true);
        Consulta consulta_III = new Consulta(dentista_III, paciente_I);
        consulta_III.addProcedimento(procedimento_I);
        consulta_II.addProcedimento(procedimento_I);
        agenda_I.addConsulta(consulta_II);
        agenda_I.addConsulta(consulta_III);
        Assertions.assertEquals(agenda_I.getListaOrdemDentista(), "Dr. Wendel da Silva" +
                "\nValor para o doutor: 13500.0"+ "\nValor para Clinica: 31500.0" +
                "\nDr. Saulo da Silva" + "\nValor para o doutor: 13500.0" +
                "\nValor para Clinica: 31500.0" + "\nDr. Rafael da Silva" +
                "\nValor para o doutor: 13500.0" + "\nValor para Clinica: 31500.0\n");
    }

    @Test
    public void shouldReturnPatientRating(){
        ClassificaPaciente.classificaPaciente(paciente_I);
        Assertions.assertEquals(ClassificaPaciente.getClassificacao(paciente_I), "A");
    }
}