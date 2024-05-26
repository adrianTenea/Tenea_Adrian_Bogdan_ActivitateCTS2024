package clase;

public class PacientInternat {
    private String numePacient;
    private boolean hasPatRabatabil;
    private boolean hasMicDejunInclus;
    private boolean hasPapuciDeCamera;
    private boolean hasHalatInterior;

    public PacientInternat(String numePacient, boolean hasPatRabatabil, boolean hasMicDejunInclus, boolean hasPapuciDeCamera, boolean hasHalatInterior) {
        super();
        this.numePacient = numePacient;
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejunInclus = hasMicDejunInclus;
        this.hasPapuciDeCamera = hasPapuciDeCamera;
        this.hasHalatInterior = hasHalatInterior;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public boolean isHasPatRabatabil() {
        return hasPatRabatabil;
    }

    public void setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    public boolean isHasMicDejunInclus() {
        return hasMicDejunInclus;
    }

    public void setHasMicDejunInclus(boolean hasMicDejunInclus) {
        this.hasMicDejunInclus = hasMicDejunInclus;
    }

    public boolean isHasPapuciDeCamera() {
        return hasPapuciDeCamera;
    }

    public void setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
        this.hasPapuciDeCamera = hasPapuciDeCamera;
    }

    public boolean isHasHalatInterior() {
        return hasHalatInterior;
    }

    public void setHasHalatInterior(boolean hasHalatInterior) {
        this.hasHalatInterior = hasHalatInterior;
    }

    @Override
    public String toString() {
        return "clase.PacientInternat{" +
                "numePacient='" + numePacient + '\'' +
                ", hasPatRabatabil=" + hasPatRabatabil +
                ", hasMicDejunInclus=" + hasMicDejunInclus +
                ", hasPapuciDeCamera=" + hasPapuciDeCamera +
                ", hasHalatInterior=" + hasHalatInterior +
                '}';
    }
}
