package modelclass;

public class IdentificadorDeDentista {
    public static String identificaDentista(Dentista dentista){
        return "É um %s".formatted(dentista.getClass().getSimpleName());
    }
}
