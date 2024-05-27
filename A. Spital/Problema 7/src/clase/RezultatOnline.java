package clase;

public class RezultatOnline extends RezultatDecorator {

    public RezultatOnline(Rezultat decoratRezultat) {
        super(decoratRezultat);
    }

    @Override
    public void puneLaDispozitie(String rezultat) {
        super.puneLaDispozitie(rezultat);
        puneLaDispozitieOnline(rezultat);
    }

    private void puneLaDispozitieOnline(String rezultat) {
        System.out.println("Rezultatul analizelor a fost pus la dispozitie online");
    }
}
