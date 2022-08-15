package model;

public abstract class Dentista extends Pessoa {
    protected String cro;
    protected double salario;
    private static int proximoCodigo = 0;

    public Dentista(String nome, String email, String cro){
        super(nome, email);
        this.cro = cro;
        this.codigo = "DE" + ++proximoCodigo;
    }
    public Dentista(Dentista dentista) {
        super(dentista.nome, dentista.email);
        this.cro = dentista.cro;
        this.codigo = dentista.getCodigo();
    }

    public String getCro() {
        return this.cro;
    }

    public void setCro(String cro){
        this.cro = cro;
    }

    public abstract double getSalario();

    public abstract void setSalario(double salario);

    public abstract Dentista getDentista();
    @Override
    public String getDescricao() {
        return "Dr(a): " + super.getDescricao()+ " -CRO: " + this.cro;
    }

    public static void setContador(int contador){
        contador = contador;
    }
}