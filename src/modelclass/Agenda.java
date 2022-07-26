package modelclass;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Consulta> listaConsulta;

    public Agenda(){
        this.listaConsulta = new ArrayList<Consulta>();
    }
    @Override
    public String toString() {
        return getAgenda();
    }

    public boolean addConsulta(Consulta consulta) {
        if(this.listaConsulta.add(consulta)){
            return true;
        }else{
            return false;
        }
    }

    public boolean removeConsulta(Consulta consulta) {
        if(this.listaConsulta.remove(consulta)){
            return true;
        }else{
            return false;
        }
    }

    public boolean verificaConsulta(Consulta consulta) {
        if(this.listaConsulta.indexOf(consulta) < 0) {
            return false;
        }
        return true;
    }

    public double faturamento() {
        double totalSalario=0;
        double totalRecebido =0;
        String nome = new String();
        for(int i = 0; i<this.listaConsulta.size(); i++) {
            if(this.listaConsulta.get(i).getDentista().getNome()!=nome) {
                totalSalario = this.listaConsulta.get(i).getDentista().getSalario() + totalSalario;
                nome = this.listaConsulta.get(i).getDentista().getNome();
            }
            totalRecebido = totalRecebido + this.listaConsulta.get(i).valorConsulta();
        }
        return totalRecebido - totalSalario;
    }
    public int qtdConsultas() {
        return this.listaConsulta.size();
    }

    public String getAgenda() {
        String d1 = new String();
        for(int i = 0; i<this.listaConsulta.size(); i++) {
            d1 = this.listaConsulta.get(i) + "\n" + d1;
        }
        return "Lista de Consultas da Clinica: \n" + d1;
    }

}
