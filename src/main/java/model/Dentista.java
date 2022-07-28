package model;

public class Dentista {
    private String nome;
    private String email;
    private String cro;
    private String codigo;
    private static int contador=1;

    public Dentista(String nome, String email, String cro){
        this.nome = nome;
        this.email = email;
        this.cro = cro;
        this.codigo = "DE" + contador++;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getCro(){
        return this.cro;
    }

    public void setCro(String cro){
        this.cro = cro;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String toString() {
        return getDescricao();
    }

    public String getDescricao() {
        return "Dr(a) " + this.nome + " -Email: "
                + this.email + " -CRO: " + this.cro;
    }

}