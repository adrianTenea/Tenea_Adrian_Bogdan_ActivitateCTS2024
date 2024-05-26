package main;

import clase.PersonalSpital;
import clase.PersonalSpitalFactory;
import clase.TipPersonalSpital;

public class ProgramPrincipal {
    public static void main(String[] args) {

        PersonalSpital brancardier = PersonalSpitalFactory.createPersonal(TipPersonalSpital.Brancardier);
        brancardier.desfasoaraActivitate();

        PersonalSpital asistent = PersonalSpitalFactory.createPersonal(TipPersonalSpital.Asistent);
        asistent.desfasoaraActivitate();

        PersonalSpital medic = PersonalSpitalFactory.createPersonal(TipPersonalSpital.Medic);
        medic.desfasoaraActivitate();
    }
}
