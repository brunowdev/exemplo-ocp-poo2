package com.brunowdev.solid.com.ocp;

/**
 * Created by BRUNO-PC on 02/04/2017.
 */
public class Enfermeira extends Funcionario {

    public Enfermeira(String nome, String setor) {
        super(nome, setor);
    }

    @Override
    public void executarFuncao() {
        System.out.println("Ministrar a medicação...");
    }

}
