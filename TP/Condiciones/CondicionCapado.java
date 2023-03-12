package TP.Condiciones;

import TP.Animal;
import TP.Hacienda;

public class CondicionCapado extends Condicion{

    @Override
    public boolean cumple(Hacienda h) {
        try{
            return ((Animal)h).capado();
        }catch(Exception e){
            return false;
        }
        
    }
    
}
