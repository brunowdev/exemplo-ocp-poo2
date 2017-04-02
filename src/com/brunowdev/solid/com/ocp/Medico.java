package com.brunowdev.solid.com.ocp;

/**
 * Created by BRUNO-PC on 02/04/2017.
 */
public class Medico extends Funcionario {

    public Medico(String nome, String setor) {
        super(nome, setor);
    }

    @Override
    public void executarFuncao() {
        System.out.println("Diagnosticar o paciente...");
    }

}
