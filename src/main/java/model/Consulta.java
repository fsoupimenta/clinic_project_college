package model;
import api.GeneralizaArray;

public class Consulta {
    private Dentista dentista;
    private Paciente paciente;
    private GeneralizaArray<Procedimento> listaProcedimento = new GeneralizaArray<>();

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
        double totalConsulta=0;
        for(Procedimento procedimento : listaProcedimento.getLista()) {
            totalConsulta = totalConsulta + procedimento.getPreco();
        }
        return totalConsulta;
    }

    public String getDescricao() {
        String listaConsultas = new String();
        for(Procedimento procedimento : listaProcedimento.getLista()) {
            listaConsultas = procedimento.getNome() + ", " + listaConsultas;
        }
        return listaConsultas + "para o " + this.paciente.getTratamento() +
                " realizada pelo/a " + this.dentista.getTratamento();
    }

}
