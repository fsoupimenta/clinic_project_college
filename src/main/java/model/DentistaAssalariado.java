package model;

public class DentistaAssalariado extends Dentista {
    public DentistaAssalariado (String nome, String email, String cro, double salario, boolean sexo) {
        super(nome, email, cro, sexo);
        this.salario = salario;
    }

    public DentistaAssalariado(Dentista dentista) {
        super(dentista.nome, dentista.email, dentista.cro, dentista.sexo);
    }

    public void setSalario(double valor) {
        this.salario = valor;
    }

    public double getSalario() {
        return this.salario;
    }
    @Override
    public Dentista getDentista(){
        return new DentistaAssalariado(this.nome, this.email, this.cro, this.salario, this.sexo);
    }
}
