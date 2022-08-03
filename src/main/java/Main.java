import java.time.LocalDate;

import model.*;

public class Main {

    public static void main(String[] args) {
        DentistaAssalariado d1 =
                new DentistaAssalariado("Rafael da Silva",
                        "rfsilva@email.com",
                        "1111", 900);
        DentistaComissionado d2 =
                new DentistaComissionado("Lucas da Silva",
                        "lcsilva@email.com",
                        "1112", 0.3);
        Paciente p1 =
                new Paciente("Jose da Silva",
                        "jssilva@email.com",
                        LocalDate.of(2001, 04, 14));
        Paciente p2 =
                new Paciente("Antonio da Silva",
                        "antoniosilva@email.com",
                        LocalDate.of(2001, 04, 13));
        Paciente p3 =
                new Paciente("Gustavo de Sa",
                        "gustavodesa@email.com",
                        LocalDate.of(1990, 06, 15));
        Paciente p4 =
                new Paciente("Henrique Silveira",
                        "henriquesilveira@email.com",
                        LocalDate.of(1994, 02, 12));
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

        System.out.println("\n-------Teste da Parte 4-------\n");
        System.out.println("Salario do Dr(a) " + d1.getNome() + ": " + d1.getSalario());
        System.out.println("Salario do Dr(a) " + d2.getNome() + ": " + d2.getSalario());
        System.out.println("O/A Dr(a)" + d1.getNome() + " " +IdentificadorDeDentista.identificaDentista(d1));
        System.out.println("O/A Dr(a)" + d2.getNome() + " " +IdentificadorDeDentista.identificaDentista(d2));
        System.out.println(d1.getCodigo());
        System.out.println(d2.getCodigo());
    }

}
