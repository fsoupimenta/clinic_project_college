package modelclass;

public abstract class Dentista extends Pessoa {
    protected String cro;
    protected double salario;
    private static int proximoCodigo = 0;

    public Dentista(String nome, String email, String cro){
        super(nome, email);
        this.cro = cro;
        this.codigo = " D" + ++proximoCodigo;
    }

    public Dentista(Dentista dentista) {
        super(dentista.nome, dentista.email);
        this.cro = dentista.cro;
    }

    public String toString() {
        return getDescricao();
    }

    public String getCro() {
        return this.cro;
    }

    public abstract double calculaSalario(double valor);

    public abstract double getSalario();

    public String getDescricao() {
        return "Dr(a): " + this.nome + " -Email: " + this.email + " -CRO: " + this.cro;
    }

    public abstract String getDentista();

}