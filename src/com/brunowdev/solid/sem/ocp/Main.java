package com.brunowdev.solid.sem.ocp;

/**
 * Created by BRUNO-PC on 02/04/2017.
 */
public class Main {

    public static void main(String... args) {
        // Atividades do hospital

        Enfermeira enfermeira = new Enfermeira("Dana Scully", "Enfermaria");

        Medico medico = new Medico("Fox Mulder", "Emergência");

        GerenteRH gerenteRH = new GerenteRH("Chris Carter", "RH");

        funcionar(enfermeira);
        funcionar(medico);
        funcionar(gerenteRH);

    }

    public static void funcionar(Funcionario funcionario) {

        if (funcionario instanceof Enfermeira) {
            System.out.println("Ministrar a medicação...");
        } else if (funcionario instanceof Medico) {
            System.out.println("Diagnosticar o paciente...");
        } else if (funcionario instanceof GerenteRH) {
            System.out.println("Contratar novos funcionários...");
        }

    }


}
