package com.brunowdev.solid.com.ocp;

/**
 * Created by BRUNO-PC on 02/04/2017.
 */
public class Recepcionista extends Funcionario {

    public Recepcionista(String nome, String setor) {
        super(nome, setor);
    }

    @Override
     public void executarFuncao() {
        System.out.println("Recepcionar os visitantes...");
    }

}
