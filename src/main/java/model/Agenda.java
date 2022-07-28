package model;

public class Agenda {
    private Consulta listaConsultas[];

    public Agenda(int qtdConsultas){
        this.listaConsultas = new Consulta[qtdConsultas];
    }

    public boolean addConsulta(Consulta consulta){
        for(int i=0;i< this.listaConsultas.length;i++){
            if(this.listaConsultas[i] == null){
                this.listaConsultas[i] = consulta;
                return true;
            }
        }
        return false;
    }

    public double calculaFaturamento(){
        double faturamento=0;
        for(int i=0;i<this.listaConsultas.length;i++){
            if(listaConsultas[i] != null){
                faturamento = listaConsultas[i].valorConsulta() + faturamento;
            }
        }
        return faturamento;
    }

    public int qtdConsultas(){
        return this.listaConsultas.length;
    }

    public String toString() {
        return getDescricao();
    }

    public String getDescricao() {
        String d1 = new String();
        for(int i = 0; i<this.listaConsultas.length; i++) {
            d1 = this.listaConsultas[i] + "\n" + d1;
        }
        return "Lista de Consultas da Clinica: \n" + d1;
    }
}
