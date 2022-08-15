package model;

import interfaces.TratamentoEspecifico;

public abstract class Dentista extends Pessoa implements TratamentoEspecifico {
    protected String cro;
    protected double salario;
    private static int proximoCodigo = 0;

    public Dentista(String nome, String email, String cro, boolean sexo){
        super(nome, email, sexo);
        this.cro = cro;
        this.codigo = " D" + ++proximoCodigo;
    }
    public Dentista(Dentista dentista) {
        super(dentista.nome, dentista.email, dentista.sexo);
        this.cro = dentista.cro;
        this.codigo = dentista.getCodigo();
    }

    public String getCro() {
        return this.cro;
    }

    public abstract double getSalario();

    public abstract Dentista getDentista();

    public abstract String getTipoDentista();
    @Override
    public String getDescricao() {
        return getTratamento() + " -Email: " + getEmail()+ " -CRO: " + this.cro;
    }

    public String getTratamento(){
        if(this.sexo){
            return "Dr. " + getNome();
        }else{
            return "Dra. " + getNome();
        }
    }
}