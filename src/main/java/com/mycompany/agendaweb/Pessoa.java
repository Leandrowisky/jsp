package com.mycompany.agendaweb;

import java.text.DateFormat;
import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dtnascimento;

    public Pessoa(String nome, String dtNascimento){
        this.nome = nome;
        DateFormat 
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(Date dtnascimento) {
        this.dtnascimento = dtnascimento;
    }
    
    
}
