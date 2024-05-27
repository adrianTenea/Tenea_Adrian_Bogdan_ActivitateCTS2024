package clase;

public class MedicamentAdapter implements Farmacie {
    private MedicamentSpital medicamentSpital;

    public MedicamentAdapter(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
