package api;

import model.Consulta;

import java.util.Comparator;

public class CriterioNomePaciente implements Comparator<Consulta> {

    public int compare(Consulta c1, Consulta c2){
        return c2.getPaciente().getNome().compareTo(c1.getPaciente().getNome());
    }
}
