package model;

public class DentistaComissionado extends Dentista {
    private double porcentagemComissao;
    private double salario=0;

    public DentistaComissionado(String nome, String email, String cro, double porcentagemComissao) {
        super(nome, email, cro);
        this.porcentagemComissao = porcentagemComissao;
        this.salario=0;
    }

    public DentistaComissionado(Dentista dentista) {
        super(dentista.nome, dentista.email, dentista.cro);
        this.porcentagemComissao = 0.3;
        this.salario=dentista.salario;
    }

    @Override
    public void setSalario(double valor) {
        this.salario = (this.porcentagemComissao * valor) + this.salario;
    }

    @Override
    public double getSalario() {
        return this.salario;
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

