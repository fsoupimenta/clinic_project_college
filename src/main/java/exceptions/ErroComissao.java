package exceptions;

public class ErroComissao extends RuntimeException{
    public ErroComissao(String mensagem){
        super(mensagem);
    }
}
