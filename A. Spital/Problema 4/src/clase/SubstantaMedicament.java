package clase;

public class SubstantaMedicament implements Cloneable {
    private String nume;
    private int cantitate;

    public SubstantaMedicament(String nume, int cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    protected SubstantaMedicament clone() throws CloneNotSupportedException {
        return new SubstantaMedicament(nume, cantitate);
    }

    @Override
    public String toString() {
        return "SubstantaMedicament{" +
                "nume='" + nume + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
}
