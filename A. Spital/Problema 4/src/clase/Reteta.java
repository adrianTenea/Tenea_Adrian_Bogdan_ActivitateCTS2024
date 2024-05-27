package clase;

public class Reteta implements RetetaPrototype {
    private String numeReteta;
    private SubstantaMedicament substantaMedicament1;
    private SubstantaMedicament substantaMedicament2;

    public Reteta(String numeReteta, SubstantaMedicament substantaMedicament1, SubstantaMedicament substantaMedicament2) {
        this.numeReteta = numeReteta;
        this.substantaMedicament1 = substantaMedicament1;
        this.substantaMedicament2 = substantaMedicament2;
    }

    public String getNumeReteta() {
        return numeReteta;
    }

    public void setNumeReteta(String numeReteta) {
        this.numeReteta = numeReteta;
    }

    public SubstantaMedicament getSubstantaMedicament1() {
        return substantaMedicament1;
    }

    public void setSubstantaMedicament1(SubstantaMedicament substantaMedicament1) {
        this.substantaMedicament1 = substantaMedicament1;
    }

    public SubstantaMedicament getSubstantaMedicament2() {
        return substantaMedicament2;
    }

    public void setSubstantaMedicament2(SubstantaMedicament substantaMedicament2) {
        this.substantaMedicament2 = substantaMedicament2;
    }

    @Override
    public RetetaPrototype clone() {
        try {
            SubstantaMedicament substantaMedicamentClonat1 = substantaMedicament1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        try {
            SubstantaMedicament substantaMedicamentClonat2 = substantaMedicament2.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return new Reteta(numeReteta, substantaMedicament1, substantaMedicament2);
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numeReteta='" + numeReteta + '\'' +
                ", substantaMedicament1=" + substantaMedicament1 +
                ", substantaMedicament2=" + substantaMedicament2 +
                '}';
    }
}
