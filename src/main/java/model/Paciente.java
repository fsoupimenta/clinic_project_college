package model;

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

    @Override
    public String getDescricao() {
        return getTratamento() + super.getDescricao() + " -Data de Nascimento: " +
                getDataDeNascimento().format(formatador);
    }

    public String getTratamento(){
        if(this.sexo){
            return "Senhora " + getNome();
        }else{
            return "Senhor " + getNome();
        }
    }
}
