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
                new Paciente("Gustavo de Sa",
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

        System.out.println("-------Teste da Parte 1-------\n");
        System.out.println(d1+"\n"+d2);
        System.out.println(p1+"\n"+p2+"\n"+p3+"\n"+p4);
        System.out.println(x1+"\n"+x2+"\n"+x3+"\n"+x4);

        System.out.println("\n-------Teste da Parte 2-------\n");
        System.out.println(c1+"\n"+c2);
        System.out.println("Valor da Consulta 1: " +c1.valorConsulta());
        System.out.println("Valor da Consulta 2: " +c2.valorConsulta());
        System.out.println(a1);
        System.out.println("Faturamento da Clinica: " +a1.faturamento());
        System.out.println("Quantidade de consultas marcadas: " +a1.qtdConsultas());
        System.out.println("Dr(a) " + d1.getNome() + (" Codigo: " + d1.getCodigo()));
        System.out.println("Dr(a) " + d2.getNome() + (" Codigo: " + d2.getCodigo()));
        System.out.println("Paciente " + p1.getNome() + (" Codigo: " + p1.getCodigo()));
        System.out.println("Paciente " + p2.getNome() + (" Codigo: " + p2.getCodigo()));
        System.out.println("Paciente " + p3.getNome() + (" Codigo: " + p3.getCodigo()));
        System.out.println("Paciente " + p4.getNome() + (" Codigo: " + p4.getCodigo()));
        System.out.println(x1.getNome() + (" Codigo: " + x1.getCodigo()));
        System.out.println(x2.getNome() + (" Codigo: " + x2.getCodigo()));
        System.out.println(x3.getNome() + (" Codigo: " + x3.getCodigo()));
        System.out.println(x4.getNome() + (" Codigo: " + x4.getCodigo()));

        System.out.println("\n-------Teste da Parte 3-------\n");
        if(a1.removeConsulta(c4)){
            System.out.println("Consulta removida com sucesso");
        }else{
            System.out.println("Consulta não removida ou não encontrada");
        }
        if(a1.verificaConsulta(c4)) {
            System.out.println("Consulta encontrada na agenda!");
        }else {
            System.out.println("Consulta nao encontrada na agenda!");
        }
        if(a1.addConsulta(c4)){
            System.out.println("Consulta adcionada com sucesso");
        }else{
            System.out.println("Consulta não adcionada");
        }
        if(a1.verificaConsulta(c4)) {
            System.out.println("Consulta encontrada na agenda!");
        }else {
            System.out.println("Consulta nao encontrada na agenda!");
        }

        System.out.println("\n-------Teste da Parte 4-------\n");
        System.out.println("Salario do Dr(a) " + d1.getNome() + ": " + d1.getSalario());
        System.out.println("Salario do Dr(a) " + d2.getNome() + ": " + d2.getSalario());
        System.out.println("O/A Dr(a)" + d1.getNome() + " " +IdentificadorDeDentista.identificaDentista(d1));
        System.out.println("O/A Dr(a)" + d2.getNome() + " " +IdentificadorDeDentista.identificaDentista(d2));
        try {
            d2.setPorcentagemComissao(0.6);
        } catch (ErroComissao e){
            e.printStackTrace();
        }
    }
}
