package clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Boolean> paturiLibere;

    public Salon(int numarPaturi){
        paturiLibere = new ArrayList<>();
        for (int i = 0; i < numarPaturi; i++){
            paturiLibere.add(true);
        }
    }

    public boolean verificaDispobibiltatePat(){
        for(Boolean patLiber : paturiLibere){
            if(patLiber){
                return true;
            }
        }
        return false;
    }

    public void ocupaPat(){
        for(int i = 0; i < paturiLibere.size(); i++){
            if(paturiLibere.get(i)) {
                paturiLibere.set(i, false);
                System.out.println("Un pat a fost ocupat");
                return;
            }
        }
    }
}
