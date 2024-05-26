package clase;

public class FactoryManagerSpital implements FactoryPersonalSpital {

    @Override
    public PersonalSpital createPersonal() {
        return new ManagerSpital();
    }
}
