package clase;

public class FactoryAsistent implements FactoryPersonalSpital {

    @Override
    public PersonalSpital createPersonal() {
        return new Asistent();
    }
}
