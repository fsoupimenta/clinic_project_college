import java.time.LocalDate;

import model.*;

public class main {

    public static void main(String[] args) {
        Dentista d1 = new Dentista("Rafael da Silva",
                "rfsilva@email.com",
                "1111");
        Dentista d2 = new Dentista("Lucas da Silva",
                "lcsilva@email.com",
                "1112");
        Paciente p1 = new Paciente("Jose da Silva",
                "jssilva@email.com",
                LocalDate.of(2001, 04, 14));
        Paciente p2 = new Paciente("Antonio da Silva",
                "antoniosilva@email.com",
                LocalDate.of(2001, 04, 13));
        Procedimento x1 = new Procedimento("Tratamento de Canal", 499);
        Procedimento x2 = new Procedimento("Tratamento de Carie", 799);

        System.out.println("Teste da Parte 1");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(x1);
        System.out.println(x2);
    }
}
