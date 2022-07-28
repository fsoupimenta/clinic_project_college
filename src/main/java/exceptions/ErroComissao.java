package exceptions;

public class ErroComissao extends RuntimeException{
    ErroComissao(String mensagem){
        super(mensagem);
    }
}
