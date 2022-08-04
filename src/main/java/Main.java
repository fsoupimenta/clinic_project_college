import model.DentistaComissionado;

public class Main {

    public static void main(String[] args) {
        DentistaComissionado d1 =
                new DentistaComissionado("Lucia da Silva",
                        "lcsilva@email.com",
                        "1112", 0.7, false);
        System.out.println(d1);
    }
}
