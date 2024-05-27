package clase;

public class MedicamentFarmacie implements Farmacie {
    @Override
    public void cumparaMedicament() {
        System.out.println("Medicament cumparat fara reteta");
    }
}
