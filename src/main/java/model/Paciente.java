package model;

import interfaces.TratamentoEspecifico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente extends Pessoa implements TratamentoEspecifico {
    private LocalDate dataDeNascimento;
    private static int proximoCodigo = 0;
    private static DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Paciente(String nome, String email, LocalDate dataDeNascimento, boolean sexo) {
        super(nome, email, sexo);
        this.dataDeNascimento = dataDeNascimento;
        this.codigo = " P" + ++proximoCodigo;
    }

    public Paciente(Paciente paciente) {
        super(paciente.nome, paciente.email, paciente.sexo);
        this.dataDeNascimento = paciente.dataDeNascimento;
    }

    public LocalDate getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }

    public double calculaGastos(){
        return Agenda.calculaValorAoPaciente(this);
    }

    @Override
    public String getDescricao() {
        return getTratamento() + " -Email: " + getEmail() + " -Data de Nascimento: " +
                getDataDeNascimento().format(formatador);
    }

    public String getTratamento(){
        String[] sobreNome = getNome().split(" ");
        if(this.sexo){
            return "Senhor " + sobreNome[sobreNome.length - 1];
        }else{
            return "Senhora " + sobreNome[sobreNome.length - 1];
        }
    }
}
