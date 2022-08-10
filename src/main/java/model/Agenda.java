package model;
import api.*;
import java.util.Collections;
import java.util.ArrayList;

public class Agenda{
    private static Agrupamento<Consulta> listaConsulta = new Agrupamento();

    @Override
    public String toString() {
        return getAgenda();
    }

    public boolean addConsulta(Consulta consulta) {
        return listaConsulta.adiciona(consulta);
    }

    public boolean removeConsulta(Consulta consulta) {
        return listaConsulta.retira(consulta);
    }

    public boolean verificaConsulta(Consulta consulta) {
        return listaConsulta.verifica(consulta);
    }

    public String getListaOrdemPaciente(){
        CriterioNomePaciente criterioNomePaciente = new CriterioNomePaciente();
        Collections.sort(listaConsulta.getLista(), criterioNomePaciente);
        String d1 = new String();
        for(Consulta consulta : listaConsulta.getLista()) {
            d1 = consulta.getPaciente().getNome() +
                    "\n" + "Valor para o doutor: " +
                    consulta.getDentista().getSalario() + "\nValor para Clinica: " +
                    (totalizaValorAoDentista(consulta.getDentista()) -
                            consulta.getDentista().getSalario()) + "\n" + d1;
        }
        return d1;
    }

    public String getListaOrdemDentista(){
        CriterioNomeDentista criterioNomeDentista = new CriterioNomeDentista();
        Collections.sort(listaConsulta.getLista(), criterioNomeDentista);
        String d1 = new String();
        for(Consulta consulta : listaConsulta.getLista()) {
                d1 = consulta.getDentista().getTratamento() +
                    "\n" + "Valor para o doutor: " +
                    consulta.getDentista().getSalario() + "\nValor para Clinica: " +
                    (totalizaValorAoDentista(consulta.getDentista()) -
                            consulta.getDentista().getSalario()) + "\n" + d1;
        }
        return d1;
    }

    public static double totalizaValorAoDentista(Dentista dentista){
        double valorAoDentista=0;
        for(Consulta consulta : listaConsulta.getLista()){
            if(dentista.nome.equals(consulta.getDentista().getNome())){
                valorAoDentista = consulta.valorConsulta() + valorAoDentista;
            }
        }
        return valorAoDentista;
    }

    public static double totalizaValorAoPaciente(Paciente paciente){
        double valorAoPaciente=0;
        for(Consulta consulta : listaConsulta.getLista()){
            if(paciente.getNome().equals(consulta.getPaciente().getNome())){
                valorAoPaciente = consulta.valorConsulta() + valorAoPaciente;
            }
        }
        return valorAoPaciente;
    }
    public double getFaturamento() {
        return 0;
    }
    public int qtdConsultas() {
        return listaConsulta.tamanho();
    }

    public String getAgenda() {
        String d1 = new String();
        for(Consulta consulta : listaConsulta.getLista()) {
            d1 = consulta + "\n" + d1;
        }
        return "Lista de Consultas da Clinica: \n" + d1;
    }
}
