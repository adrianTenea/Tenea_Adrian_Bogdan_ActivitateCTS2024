package clase;

public class FactoryBrancardier implements FactoryPersonalSpital {

    @Override
    public PersonalSpital createPersonal() {
        return new Brancardier();
    }
}
