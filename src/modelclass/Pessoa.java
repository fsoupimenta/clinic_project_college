package modelclass;

public class Pessoa {
    protected String nome;
    protected String email;
    protected String codigo;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
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