package com.brunowdev.solid.com.ocp;

/**
 * Created by BRUNO-PC on 02/04/2017.
 */
public class Main {

    public static void main(String... args) {

        // Atividades do hospital

        Enfermeira enfermeira = new Enfermeira("Dana Scully", "Enfermaria");

        Medico medico = new Medico("Fox Mulder", "Emergência");

        GerenteRH gerenteRH = new GerenteRH("Chris Carter", "RH");

        Recepcionista rececepcionista = new Recepcionista("Ana", "Recepção");

        funcionar(enfermeira);
        funcionar(medico);
        funcionar(gerenteRH);
        funcionar(rececepcionista);

    }

    public static void funcionar(Funcionario funcionario) {
        funcionario.executarFuncao();
    }


}
