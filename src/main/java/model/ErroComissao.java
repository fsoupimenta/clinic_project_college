package model;

public class ErroComissao extends RuntimeException{
    ErroComissao(String mensagem){
        super(mensagem);
    }
}
