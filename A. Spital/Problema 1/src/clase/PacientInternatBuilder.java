package clase;

public class PacientInternatBuilder implements Builder {


    PacientInternat pacientInternat;

    public PacientInternatBuilder(){
        pacientInternat = new PacientInternat("Popescu", false, false,false,false);
    }

    @Override
    public PacientInternat build() {
        return pacientInternat;
    }

    public PacientInternatBuilder setNumePacient(String numePacient){
        this.pacientInternat.setNumePacient(numePacient);
        return this;
    }

    public PacientInternatBuilder setHasPatRabatabil (boolean hasPatRabatabil){
        this.pacientInternat.setHasPatRabatabil(hasPatRabatabil);
        return this;
    }

    public PacientInternatBuilder setHasMicDejunInclus (boolean hasMicDejunInclus){
        this.pacientInternat.setHasMicDejunInclus(hasMicDejunInclus);
        return this;
    }

    public PacientInternatBuilder setHasPapuciDeCamera (boolean hasPapuciDeCamera){
        this.pacientInternat.setHasPapuciDeCamera(hasPapuciDeCamera);
        return this;
    }

    public PacientInternatBuilder setHasHalatInterior (boolean hasHalatInterior){
        this.pacientInternat.setHasHalatInterior(hasHalatInterior);
        return this;
    }
}
