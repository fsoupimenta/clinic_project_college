package modelclass;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Consulta> listaConsultas;

    public Agenda(){
        this.listaConsultas = new ArrayList<Consulta>();
    }

    public void addConsulta(Consulta consulta){
        this.listaConsultas.add(consulta);
    }

    public void removeConsulta(Consulta consulta) {
        this.listaConsultas.remove(consulta);
    }

    public boolean verificaConsulta(Consulta consulta) {
        if(this.listaConsultas.indexOf(consulta) > 0) {
            return true;
        }
        return false;
    }

    public double calculaFaturamento(){
        double faturamento=0;
        for(int i=0;i<this.listaConsultas.size();i++){
            faturamento = this.listaConsultas.get(i).valorConsulta() + faturamento;
        }
        return faturamento;
    }

    public int qtdConsultas(){
        return this.listaConsultas.size();
    }
}
