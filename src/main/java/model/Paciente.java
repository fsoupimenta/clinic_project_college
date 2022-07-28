package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente {
    private String nome;
    private String email;
    private LocalDate dataDeNascimento;
    private static DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String codigo;
    private static int contador=1;

    public Paciente(String nome, String email, LocalDate dataDeNascimento){
        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.codigo = "PA" + contador++;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getDataDeNascimento(){
        return this.dataDeNascimento.format(formatador);
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }

    public String toString() {
        return getDescricao();
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public String getCro(){
        return this.dataDeNascimento.format(formatador);
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getDescricao() {
        return "Sr(a) " + this.nome + " -Data de Nascimento: " + dataDeNascimento.format(formatador) +  " -Email: " + this.email;
    }

}