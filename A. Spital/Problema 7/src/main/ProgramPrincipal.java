package main;

import clase.Rezultat;
import clase.RezultatOnline;
import clase.RezultatPrintat;

public class ProgramPrincipal {
    public static void main(String[] args){
        Rezultat rezultatPrintat = new RezultatPrintat();
        rezultatPrintat.puneLaDispozitie("Rezultat printat");

        Rezultat rezultatOnline = new RezultatOnline(rezultatPrintat);
        rezultatOnline.puneLaDispozitie("Rezultate analize");
    }
}
