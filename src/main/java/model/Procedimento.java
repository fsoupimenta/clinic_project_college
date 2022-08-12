package model;

public class Procedimento {
    private String nome;
    private double preco;
    private String codigo;
    private static int contador=1;

    public Procedimento(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public Procedimento(Procedimento procedimento) {
        this.nome = procedimento.nome;
        this.preco = procedimento.preco;
        this.codigo = procedimento.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public double getPreco(double Preco){
        return this.preco;
    }

    public void setPreco(){
        this.preco = preco;
    }

    public String toString() {
        return getDescricao();
    }

    public String getDescricao() {
        return this.nome + " - Custo: " + this.preco;
    }

}
