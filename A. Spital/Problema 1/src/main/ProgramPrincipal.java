package main;

import clase.PacientInternat;
import clase.PacientInternatBuilder;

public class ProgramPrincipal {
    public static void main (String[] args){
        PacientInternat pacientInternat1= new PacientInternatBuilder()
                .setNumePacient("Popescu Ion")
                .setHasHalatInterior(true)
                .setHasMicDejunInclus(true)
                .build();
        System.out.println(pacientInternat1);

        PacientInternat pacientInternat2 = new PacientInternatBuilder()
                .setNumePacient("Ionescu Andreea")
                .setHasHalatInterior(true)
                .setHasMicDejunInclus(true)
                .setHasPapuciDeCamera(true)
                .setHasPatRabatabil(true)
                .build();
        System.out.println(pacientInternat2);

        PacientInternat pacientInternat3 = new PacientInternatBuilder()
                .setNumePacient("Popovici Cristian")
                .build();
        System.out.println(pacientInternat3);
    }
}
