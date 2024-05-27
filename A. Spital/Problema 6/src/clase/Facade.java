package clase;

public class Facade {
    private Pacient pacient;
    private Medic medic;
    private Salon salon;

    public Facade(Pacient pacient, Medic medic, Salon salon){
        this.pacient = pacient;
        this.medic = medic;
        this.salon = salon;
    }

    public boolean verificaSiInterneazaPacient(){
        if(pacient.isStareGrava()){
            System.out.println("Starea pacientului este grava");

            if(medic.confirmaInternarea(pacient)){
                if(salon.verificaDispobibiltatePat()){
                    salon.ocupaPat();
                    System.out.println("Pacientul " + pacient.getNume() + " a fost internat cu succes.");
                    return true;
                } else{
                    System.out.println("Nu sunt paturi disponibile in salon.");
                }
            } else{
                System.out.println("Medicul nu a confirmat internarea pacientului " + pacient.getNume() + ".");
            }
        } else{
            System.out.println("Starea pacientului nu este suficient de grava pentru internare.");
        }
        return false;
    }
}
