package clase;

public class FactoryMedic implements FactoryPersonalSpital {

    @Override
    public PersonalSpital createPersonal() {
        return new Medic();
    }
}
