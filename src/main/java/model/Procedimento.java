package model;

public class Procedimento {
    String nome;
    double preco;


    public Procedimento(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
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
