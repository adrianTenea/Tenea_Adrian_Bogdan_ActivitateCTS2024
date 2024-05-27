package main;

import clase.Reteta;
import clase.SubstantaMedicament;

public class ProgramPrincipal {
    public static void main(String[] args) {
        SubstantaMedicament substantaMedicament1 = new SubstantaMedicament("Substanta 1", 10);
        SubstantaMedicament substantaMedicament2 = new SubstantaMedicament("Substanta 2", 20);

        Reteta retetaCreata = new Reteta("Reteta Originala", substantaMedicament1, substantaMedicament2);
        System.out.println(retetaCreata);

        Reteta retetaClonata1 = (Reteta) retetaCreata.clone();
        Reteta retetaClonata2 = (Reteta) retetaCreata.clone();

        retetaClonata1.setNumeReteta("Reteta Originala - Clona 1");
        retetaClonata2.setNumeReteta("Reteta Originala - Clona 2");

        System.out.println(retetaClonata1);
        System.out.println(retetaClonata2);

        retetaClonata1.getSubstantaMedicament1().setCantitate(15);

        System.out.println(retetaClonata1);

    }
}
