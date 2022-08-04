package model;
import api.CriterioNomeDentista;
import api.CriterioNomePaciente;

import java.util.ArrayList;
import java.util.Collections;

public class Agenda{
    private static ArrayList<Consulta> listaConsulta;

    public Agenda(){
        this.listaConsulta = new ArrayList<Consulta>();
    }
    @Override
    public String toString() {
        return getAgenda();
    }

    public boolean addConsulta(Consulta consulta) {
        if(this.listaConsulta.add(consulta)){
            return true;
        }else{
            return false;
        }
    }

    public boolean removeConsulta(Consulta consulta) {
        if(this.listaConsulta.remove(consulta)){
            return true;
        }else{
            return false;
        }
    }

    public boolean verificaConsulta(Consulta consulta) {
        if(this.listaConsulta.indexOf(consulta) < 0) {
            return false;
        }
        return true;
    }

    public String ordenaNomePaciente(){
        CriterioNomePaciente criterioNomePaciente = new CriterioNomePaciente();
        Collections.sort(this.listaConsulta, criterioNomePaciente);
        return getListaOrdemPaciente();
    }

    public String ordenaNomeDentista(){
        CriterioNomeDentista criterioNomeDentista = new CriterioNomeDentista();
        Collections.sort(this.listaConsulta, criterioNomeDentista);
        return getListaOrdemDentista();
    }

    public static double totalizaValorAoComissionado(Dentista dentista){
        double valorAoDentista=0;
        for(int i=0; i<listaConsulta.size(); i++){
            if(dentista.nome.equals(listaConsulta.get(i).getDentista().getNome())){
                valorAoDentista = listaConsulta.get(i).valorConsulta() + valorAoDentista;
            }
        }
        return valorAoDentista;
    }

    public static double calculaValorAoPaciente(Paciente paciente){
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
        for(int i = 0; i<this.listaConsulta.size(); i++) {
            d1 = this.listaConsulta.get(i) + "\n" + d1;
        }
        return "Lista de Consultas da Clinica: \n" + d1;
    }

    public String getListaOrdemPaciente(){
        String d1 = new String();
        for(int i = 0; i<this.listaConsulta.size(); i++) {
            d1 = this.listaConsulta.get(i).getPaciente().getNome() + " " + d1;
        }
        return d1;
    }

    public String getListaOrdemDentista(){
        String d1 = new String();
        for(int i = 0; i<this.listaConsulta.size(); i++) {
            d1 = this.listaConsulta.get(i).getDentista().getNome() + " " + d1;
        }
        return d1;
    }
}
