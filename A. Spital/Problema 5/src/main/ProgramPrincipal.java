package main;

import clase.Farmacie;
import clase.MedicamentAdapter;
import clase.MedicamentSpital;

public class ProgramPrincipal {
    public static void main(String[] args){
        MedicamentSpital medicamentSpital = new MedicamentSpital();
        Farmacie medicamentAdapter = new MedicamentAdapter(medicamentSpital);
        medicamentAdapter.cumparaMedicament();
    }
}
