package api;

import model.Consulta;

import java.util.Comparator;

public class CriterioNomeDentista implements Comparator<Consulta> {

    public int compare(Consulta c1, Consulta c2){
        return c1.getDentista().getNome().compareTo(c2.getDentista().getNome());
    }
}
