package model;

public class DentistaComissionado extends Dentista {
    private double porcentagemComissao;

    public DentistaComissionado(String nome, String email, String cro, double porcentagemComissao) {
        super(nome, email, cro);
        this.porcentagemComissao = porcentagemComissao;
    }

    public DentistaComissionado(Dentista dentista) {
        super(dentista.nome, dentista.email, dentista.cro);
        this.porcentagemComissao = 0.3;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario * this.porcentagemComissao;
    }

    public double getPorcentagemComissao() {
        return this.porcentagemComissao;
    }

    public void setPorcentagemComissao(double porcentagemComissao){
        this.porcentagemComissao = porcentagemComissao;
    }

    @Override
    public Dentista getDentista(){
        return new DentistaComissionado(this.nome, this.email, this.cro, this.porcentagemComissao);
    }
}

