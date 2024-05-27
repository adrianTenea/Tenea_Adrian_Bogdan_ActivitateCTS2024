package main;

import clase.Pacient;
import clase.Medic;
import clase.Salon;
import clase.Facade;

public class ProgramPrincipal {
    public static void main(String[] args){
        Pacient pacient = new Pacient("Ion Popescu", true);
        Medic medic = new Medic();
        Salon salon = new Salon(10);

        Facade facade = new Facade(pacient, medic, salon);
        facade.verificaSiInterneazaPacient();
    }
}
