package model;

public class DentistaAssalariado extends Dentista {
    public DentistaAssalariado (String nome, String email, String cro, double salario) {
        super(nome, email, cro);
        this.salario = salario;
    }

    public DentistaAssalariado(Dentista dentista) {
        super(dentista.nome, dentista.email, dentista.cro);
        this.salario = dentista.salario;
    }

    @Override
    public void setSalario(double valor) {
        this.salario = valor;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }
    @Override
    public Dentista getDentista(){
        return new DentistaAssalariado(this.nome, this.email, this.cro, this.salario);
    }
}
