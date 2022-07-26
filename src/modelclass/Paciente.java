package modelclass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente extends Pessoa {
    private LocalDate dataDeNascimento;
    private static int proximoCodigo = 0;
    private static DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Paciente(String nome, String email, LocalDate dataDeNascimento) {
        super(nome, email);
        this.dataDeNascimento = dataDeNascimento;
        this.codigo = " P" + ++proximoCodigo;
    }

    public Paciente(Paciente paciente) {
        super(paciente.nome, paciente.email);
        this.dataDeNascimento = paciente.dataDeNascimento;
    }

    public LocalDate getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    @Override
    public String getDescricao() {
        return "Sr(a) " + super.getDescricao() + " -Data de Nascimento: " +
                getDataDeNascimento().format(formatador);
    }
}
