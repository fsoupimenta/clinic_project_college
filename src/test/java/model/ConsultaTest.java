package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import java.time.LocalDate;




class ConsultaTest {

    DentistaAssalariado d1;
    Paciente p1;
    Procedimento x1;
    Consulta c1;
    @BeforeEach
    public void init() {
        d1 =
                new DentistaAssalariado("Rafael da Silva",
                        "rfsilva@email.com",
                        "1111", 900);
        p1 = new Paciente("Jose da Silva",
                "jssilva@email.com",
                LocalDate.of(2001, 04, 14));
        x1 = new Procedimento("Tratamento de Canal", 499);
        c1 = new Consulta(d1, p1);
        c1.addProcedimento(x1);
    }

    @Test
    public void verifica_descricao() {
        Assertions.assertEquals(c1.getDescricao(), "Tratamento de Canal, para o paciente: " +
                "Jose da Silva realizada pelo Dr(a): Rafael da Silva");
    }

    @Test
    public void verifica_valor_consulta(){
        Assertions.assertEquals(c1.valorConsulta(), 499);
    }

    @AfterEach
    public void cleanUp(){
        Dentista.setContador(1);
        Paciente.setContador(1);
        Procedimento.setContador(1);
    }
}