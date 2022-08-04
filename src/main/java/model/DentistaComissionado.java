package model;

import exceptions.ErroComissao;

public class DentistaComissionado extends Dentista {
    private double porcentagemComissao;
    private double salario=0;

    public DentistaComissionado(String nome, String email, String cro, double porcentagemComissao, boolean sexo) {
        super(nome, email, cro, sexo);
        try {
            setPorcentagemComissao(porcentagemComissao);
        }catch (ErroComissao e){
            e.getMessage();
        }
    }

    public DentistaComissionado(Dentista dentista) {
        super(dentista.nome, dentista.email, dentista.cro, dentista.sexo);
        this.porcentagemComissao = 0.3;
    }

    public double getSalario(){
        return Agenda.totalizaValorAoComissionado(this) * this.porcentagemComissao;
    }

    public double getPorcentagemComissao() {
        return this.porcentagemComissao;
    }

    public boolean setPorcentagemComissao(double porcentagemComissao) throws ErroComissao{
        if (porcentagemComissao > 0.5 || porcentagemComissao < 0) {
            throw new ErroComissao("Porcentagem Invalida");
        }
        this.porcentagemComissao = porcentagemComissao;
        return true;
    }

    @Override
    public Dentista getDentista(){
        return new DentistaComissionado(this.nome, this.email, this.cro, this.porcentagemComissao, this.sexo);
    }
}

