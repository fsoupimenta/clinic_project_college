import java.time.LocalDate;

import model.*;

public class main {

    public static void main(String[] args) {
        DentistaAssalariado d1 =
                new DentistaAssalariado("Rafael da Silva",
                        "rfsilva@email.com",
                        "1111", 900, true);
        DentistaComissionado d2 =
                new DentistaComissionado("Lucia da Silva",
                        "lcsilva@email.com",
                        "1112", 0.4, false);
        Paciente p1 =
                new Paciente("Jose da Silva",
                        "jssilva@email.com",
                        LocalDate.of(2001, 04, 14), true);
        Paciente p2 =
                new Paciente("Antonio da Silva",
                        "antoniosilva@email.com",
                        LocalDate.of(2001, 04, 13), true);
        Paciente p3 =
                new Paciente("Gustavo de Oliveira",
                        "gustavodesa@email.com",
                        LocalDate.of(1990, 06, 15), true);
        Paciente p4 =
                new Paciente("Rafaela Silveira",
                        "henriquesilveira@email.com",
                        LocalDate.of(1994, 02, 12), false);
        Procedimento x1 =
                new Procedimento("Tratamento de Canal", 800);
        Procedimento x2 =
                new Procedimento("Tratamento de Carie", 500);
        Procedimento x3 =
                new Procedimento("Protese", 1200);
        Procedimento x4 =
                new Procedimento("Limpeza", 200);
        Consulta c1 = new Consulta(d1, p1);
        if(c1.addProcedimento(x1)){
            System.out.println("Procedimento adcionado com sucesso");
        }else{
            System.out.println("Procedimento não adcionado");
        }
        Consulta c2 = new Consulta(d1, p2);
        if(c2.addProcedimento(x2)){
            System.out.println("Procedimento adcionado com sucesso");
        }else{
            System.out.println("Procedimento não adcionado");
        }
        Consulta c3 = new Consulta(d2, p3);
        if(c3.addProcedimento(x3)){
            System.out.println("Procedimento adcionado com sucesso");
        }else{
            System.out.println("Procedimento não adcionado");
        }
        Consulta c4 = new Consulta(d2, p4);
        if(c4.addProcedimento(x4)){
            System.out.println("Procedimento adcionado com sucesso");
        }else{
            System.out.println("Procedimento não adcionado");
        }
        Agenda a1 = new Agenda();
        if(a1.addConsulta(c1)){
            System.out.println("Consulta adcionada com sucesso");
        }else{
            System.out.println("Consulta não adcionada");
        }
        if(a1.addConsulta(c2)){
            System.out.println("Consulta adcionada com sucesso");
        }else{
            System.out.println("Consulta não adcionada");
        }
        if(a1.addConsulta(c3)){
            System.out.println("Consulta adcionada com sucesso");
        }else{
            System.out.println("Consulta não adcionada");
        }
        if(a1.addConsulta(c4)){
            System.out.println("Consulta adcionada com sucesso");
        }else{
            System.out.println("Consulta não adcionada");
        }

        System.out.println("-------Teste da Parte 5-------\n");
        System.out.println(d1+"\n"+d2);
        System.out.println(p1+"\n"+p2+"\n"+p3+"\n"+p4);

        try {
            d2.setPorcentagemComissao(0.6);
        } catch (ErroComissao e){
            e.printStackTrace();
        }
    }
}
