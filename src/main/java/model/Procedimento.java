package model;

public class Procedimento {
    private String nome;
    private double preco;
    private static int proximoCodigo = 0;
    private String codigo;

    public Procedimento(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = "PO" + ++proximoCodigo;
    }

    public Procedimento(Procedimento procedimento) {
        this.nome = procedimento.nome;
        this.preco = procedimento.preco;
        this.codigo = procedimento.getCodigo();
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

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.nome + " -Preco: " + this.preco + "R$";
    }

    public static void setContador(int contador){
        contador = contador;
    }

}