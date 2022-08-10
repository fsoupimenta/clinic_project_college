package model;
import api.Agrupamento;

import java.util.ArrayList;

public class Consulta {
    private Dentista dentista;
    private Paciente paciente;
    private Agrupamento<Procedimento> listaProcedimento = new Agrupamento<>();

    public Consulta(Dentista dentista, Paciente paciente){
        this.dentista = dentista;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return getDescricao();
    }

    public boolean addProcedimento(Procedimento procedimento) {
        return this.listaProcedimento.adiciona(procedimento);
    }

    public boolean removeProcedimento(Procedimento procedimento) {
        return this.listaProcedimento.retira(procedimento);
    }

    public boolean verificaProcedimento(Procedimento procedimento) {
        return this.listaProcedimento.verifica(procedimento);
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
        for(Procedimento procedimento : listaProcedimento.getLista()) {
            total = total + procedimento.getPreco();
        }
        return total;
    }

    public String getDescricao() {
        String consultas = new String();
        for(Procedimento procedimento : listaProcedimento.getLista()) {
            consultas = procedimento.getNome() + ", " + consultas;
        }
        return consultas + "para o paciente: " + this.paciente.getNome() +
                " realizada pelo Dr(a): " + this.dentista.getNome();
    }

}
