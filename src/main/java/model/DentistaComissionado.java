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
            System.out.println(e.getMessage());
        }
    }

    public DentistaComissionado(String nome, String email, String cro, double porcentagemComissao,
                                boolean sexo, String codigo) {
        super(nome, email, cro, sexo);
        this.codigo = codigo;
        try {
            setPorcentagemComissao(porcentagemComissao);
        }catch (ErroComissao e){
            System.out.println(e.getMessage());
        }
    }

    public double getSalario(){
        return Agenda.totalizaValorAoDentista(this) * this.porcentagemComissao;
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

    public String getTipoDentista() {
        return "É um Dentista Comissionado";
    }

    @Override
    public Dentista getDentista(){
        return new DentistaComissionado(this.nome, this.email, this.cro, this.porcentagemComissao,
                this.sexo, this.codigo);
    }
}

