package clase;

public abstract class RezultatDecorator implements Rezultat {
    protected  Rezultat decoratRezultat;

    public RezultatDecorator(Rezultat decoratRezultat) {
        this.decoratRezultat = decoratRezultat;
    }

    @Override
    public void puneLaDispozitie(String rezultat) {
        decoratRezultat.puneLaDispozitie(rezultat);
    }
}
