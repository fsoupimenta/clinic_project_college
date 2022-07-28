package modelclass;

public class Consulta {
    private Dentista dentista;
    private Paciente paciente;
    private Procedimento procedimento;

    public Consulta(Dentista dentista, Paciente paciente, Procedimento procedimento){
        this.dentista = dentista;
        this.paciente = paciente;
        this.procedimento = procedimento;
    }

    public String toString(){
        return getDescricao();
    }

    public Dentista getDentista(){
        return this.dentista;
    }

    public Paciente getPaciente(){
        return this.paciente;
    }

    public Procedimento getProcedimento(){
        return this.procedimento;
    }

    public double valorConsulta(){
        return this.procedimento.getPreco();
    }

    public String getDescricao(){
        return this.procedimento.getNome() + " realizado pelo Dr(a): " + this.dentista.getNome()+
                " para o paciente: " + this.paciente.getNome();
    }
}
