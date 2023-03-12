package TP.Condiciones;

import TP.Animal;
import TP.Hacienda;

public abstract class CondicionAnimal extends Condicion{

    @Override
    public boolean cumple(Hacienda h) {
        try{
            return cumple((Animal)h);
        }catch(Exception e){
            return false;
        }
    }

    public abstract boolean cumple(Animal h);
    
}
