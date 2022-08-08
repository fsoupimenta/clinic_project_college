package model;
import api.Agrupamento;

import java.util.ArrayList;

public class Consulta {
    private Dentista dentista;
    private Paciente paciente;
    private ArrayList<Procedimento> listaProcedimento = new ArrayList<>();

    public Consulta(Dentista dentista, Paciente paciente){
        this.dentista = dentista;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return getDescricao();
    }

    public boolean addProcedimento(Procedimento procedimento) {
        return this.listaProcedimento.add(procedimento);
    }

    public boolean removeProcedimento(Procedimento procedimento) {
        return this.listaProcedimento.remove(procedimento);
    }

    public boolean verificaProcedimento(Procedimento procedimento) {
        return this.listaProcedimento.contains(procedimento);
    }

    public Paciente getPaciente() {
        return new Paciente(this.paciente);
    }

    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return this.dentista.getDentista();
    }

    public void setDentista(Dentista dentista){
        this.dentista = dentista;
    }

    public double valorConsulta() {
        double total=0;
        for(int i = 0; i<this.listaProcedimento.size(); i++) {
            total = total + this.listaProcedimento.get(i).getPreco();
        }
        return total;
    }

    public String getDescricao() {
        String consultas = new String();
        for(int i=0; i<listaProcedimento.size(); i++) {
            consultas = listaProcedimento.get(i).getNome() + ", " + consultas;
        }
        return consultas + "para o paciente: " + this.paciente.getNome() +
                " realizada pelo Dr(a): " + this.dentista.getNome();
    }

}
