package clase;

public class RezultatPrintat implements Rezultat {

    @Override
    public void puneLaDispozitie(String rezultat) {
        System.out.println("Rezultatul analizelor a fost printat: " + rezultat);
    }
}
