package clase;

public class PersonalSpitalFactory {
    public static PersonalSpital createPersonal(TipPersonalSpital tipPersonal) {
        switch(tipPersonal) {
            case Brancardier:
                return new Brancardier();
            case Asistent:
                return new Asistent();
            case Medic:
                return new Medic();
            default:
                throw new IllegalArgumentException("Tip personal spital necunoscut");
        }
    }
}
