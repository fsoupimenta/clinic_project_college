package api;
import model.Paciente;

import java.util.HashMap;

public class ClassificaPaciente {
    private static HashMap<String, String> classifica = new HashMap<String, String>();

    public static void classificaPaciente(Paciente paciente){
        if(paciente.calculaGastos() > 30000){
            classifica.put(paciente.getNome(), "A");
        }else{
            classifica.put(paciente.getNome(), "B");
        }
    }

    public static String getClassificacao(String nome){
        return classifica.get(nome);
    }
}
