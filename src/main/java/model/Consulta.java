package model;

public class Consulta {
    private Dentista dentista;
    private Paciente paciente;
    private Procedimento procedimento;

    public Consulta(Dentista dentista, Paciente paciente, Procedimento procedimento){
        this.dentista = dentista;
        this.paciente = paciente;
        this.procedimento = procedimento;
    }

    public Dentista getDentista(){
        return new Dentista(this.dentista);
    }

    public void setDentista(Dentista dentista){
        this.dentista = dentista;
    }

    public Paciente getPaciente(){
        return new Paciente(this.paciente);
    }

    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    public Procedimento getProcedimento(){
        return new Procedimento(this.procedimento) ;
    }

    public void setProcedimento(Procedimento procedimento){
        this.procedimento = procedimento;
    }

    public double valorConsulta(){
        return this.procedimento.getPreco();
    }

    public String toString(){
        return getDescricao();
    }

    public String getDescricao(){
        return this.procedimento.getNome() + " realizado pelo Dr(a): " + this.dentista.getNome()+
                " para o paciente: " + this.paciente.getNome();
    }
}
