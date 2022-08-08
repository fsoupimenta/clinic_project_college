package api;
import model.Paciente;

import java.util.HashMap;

public class ClassificaPaciente {
    private static final HashMap<Paciente, String> classificacaoPaciente = new HashMap<>();

    public static void classificaPaciente(Paciente paciente){
        if(paciente.calculaGastos() >= 30000) {
            classificacaoPaciente.put(paciente, "A");
        } else if (paciente.calculaGastos() < 30000 && paciente.calculaGastos() >= 10000) {
            classificacaoPaciente.put(paciente, "B");
        } else {
            classificacaoPaciente.put(paciente, "C");
        }
    }

    public static String getClassificacao(Paciente paciente){
        return classificacaoPaciente.get(paciente);
    }
}
