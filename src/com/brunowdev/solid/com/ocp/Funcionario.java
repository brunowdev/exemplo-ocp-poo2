package com.brunowdev.solid.com.ocp;

/**
 * Created by BRUNO-PC on 02/04/2017.
 */
public abstract class Funcionario {

    private String nome;
    private String setor;

    public Funcionario(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public abstract void executarFuncao();

}
