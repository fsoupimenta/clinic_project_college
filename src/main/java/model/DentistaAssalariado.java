package model;

public class DentistaAssalariado extends Dentista {
    public DentistaAssalariado (String nome, String email, String cro, double salario, boolean sexo) {
        super(nome, email, cro, sexo);
        this.salario = salario;
    }

    public DentistaAssalariado(Dentista dentista) {
        super(dentista.nome, dentista.email, dentista.cro, dentista.sexo);
        this.salario = dentista.calculaSalario(0.1);
    }

    @Override
    public double calculaSalario(double valor) {
        return this.salario;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }
    @Override
    public Dentista getDentista(){
        return new DentistaAssalariado(this.nome, this.email, this.cro, this.salario, this.sexo);
    }
}
