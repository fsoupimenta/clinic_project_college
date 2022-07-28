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

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getSexo(){
        if(this.sexo){
            return "Masculino";
        }
        return "Feminino";
    }

    public void setSexo(boolean sexo){
        this.sexo = sexo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return getNome() + " -Email:" + getEmail();
    }
}