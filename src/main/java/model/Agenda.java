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

    public void ordenaNomePaciente(){
        CriterioNomePaciente criterioNomePaciente = new CriterioNomePaciente();
        Collections.sort(this.listaConsulta, criterioNomePaciente);
    }

    public void ordenaNomeDentista(){
        CriterioNomeDentista criterioNomeDentista = new CriterioNomeDentista();
        Collections.sort(this.listaConsulta, criterioNomeDentista);
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

    public static double calculaValorAoPaciente(String nome){
        double valorAoPaciente=0;
        for(int i=0; i<listaConsulta.size(); i++){
            if(nome.equals(listaConsulta.get(i).getPaciente().getNome())){
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

}
