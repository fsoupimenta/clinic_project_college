package modelclass;

public class Procedimento {
    private String nome;
    private double preco;
    private static int proximoCodigo = 0;
    private String codigo;

    public Procedimento(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = " PO" + ++proximoCodigo;
    }

    public Procedimento(Procedimento procedimento) {
        this.nome = procedimento.nome;
        this.preco = procedimento.preco;
        this.codigo = procedimento.codigo;
    }

    @Override
    public String toString() {
        return getProcedimento();
    }

    public String getNome() {
        return this.nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getProcedimento() {
        return this.nome + " -Preco: " + this.preco + "R$";
    }

}