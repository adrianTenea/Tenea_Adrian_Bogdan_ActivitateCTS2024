package main;

import clase.*;

public class ProgramPrincipal {
    public static void main(String[] args) {
        FactoryPersonalSpital factoryBrancardier = new FactoryBrancardier();
        PersonalSpital brancardier = factoryBrancardier.createPersonal();
        brancardier.desfasoaraActivitate();

        FactoryPersonalSpital factoryAsistent = new FactoryAsistent();
        PersonalSpital asistent = factoryAsistent.createPersonal();
        asistent.desfasoaraActivitate();

        FactoryPersonalSpital factoryMedic = new FactoryMedic();
        PersonalSpital medic = factoryMedic.createPersonal();
        medic.desfasoaraActivitate();

        FactoryPersonalSpital factoryManagerSpital= new FactoryManagerSpital();
        PersonalSpital managerSpital = factoryManagerSpital.createPersonal();
        managerSpital.desfasoaraActivitate();
    }
}
