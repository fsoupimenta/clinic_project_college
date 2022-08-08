package model;
import api.*;
import java.util.Collections;
import java.util.ArrayList;

public class Agenda{
    private static Agrupamento<Consulta> listaConsulta = new Agrupamento();

    public Agenda(){

    }
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
        Collections.sort(listaConsulta, criterioNomePaciente);
        String d1 = new String();
        for(int i = 0; i<this.listaConsulta.size(); i++) {
            d1 = this.listaConsulta.get(i).getPaciente().getNome() +
                    "\n" + "Valor para o doutor: " +
                    listaConsulta.get(i).getDentista().getSalario() + "\nValor para Clinica: " +
                    (totalizaValorAoDentista(listaConsulta.get(i).getDentista()) -
                            listaConsulta.get(i).getDentista().getSalario()) + "\n" + d1;
        }
        return d1;
    }

    public String getListaOrdemDentista(){
        CriterioNomeDentista criterioNomeDentista = new CriterioNomeDentista();
        Collections.sort(this.listaConsulta, criterioNomeDentista);
        String d1 = new String();
        for(int i = 0; i<this.listaConsulta.size(); i++) {
                d1 = this.listaConsulta.get(i).getDentista().getTratamento() +
                    "\n" + "Valor para o doutor: " +
                    listaConsulta.get(i).getDentista().getSalario() + "\nValor para Clinica: " +
                    (totalizaValorAoDentista(listaConsulta.get(i).getDentista()) -
                            listaConsulta.get(i).getDentista().getSalario()) + "\n" + d1;
        }
        return d1;
    }

    public static double totalizaValorAoDentista(Dentista dentista){
        double valorAoDentista=0;
        for(int i=0; i<listaConsulta.size(); i++){
            if(dentista.nome.equals(listaConsulta.get(i).getDentista().getNome())){
                valorAoDentista = listaConsulta.get(i).valorConsulta() + valorAoDentista;
            }
        }
        return valorAoDentista;
    }

    public static double totalizaValorAoPaciente(Paciente paciente){
        double valorAoPaciente=0;
        for(int i=0; i<listaConsulta.size(); i++){
            if(paciente.getNome().equals(listaConsulta.get(i).getPaciente().getNome())){
                valorAoPaciente = listaConsulta.get(i).valorConsulta() + valorAoPaciente;
            }
        }
        return valorAoPaciente;
    }
    public double getFaturamento() {
        return 0;
    }
    public int qtdConsultas() {
        return this.listaConsulta.size();
    }

    public String getAgenda() {
        String d1 = new String();
        for(int i=0; i<listaConsulta.size(); i++) {
            d1 = listaConsulta.get(i) + "\n" + d1;
        }
        return "Lista de Consultas da Clinica: \n" + d1;
    }
}
