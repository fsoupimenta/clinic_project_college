package model;

public class Pessoa {
    protected String nome;
    protected String email;
    protected String codigo;
    protected boolean sexo;

    public Pessoa(String nome, String email, boolean sexo) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return getDescricao();
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return getNome() + " -Email:" + getEmail();
    }
}