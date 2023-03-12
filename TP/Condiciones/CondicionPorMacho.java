package TP.Condiciones;

import TP.Animal;
import TP.Hacienda;

public class CondicionPorMacho extends Condicion{

    @Override
    public boolean cumple(Hacienda h) {
        try{
            return ((Animal)h).esMacho();
        }catch(Exception e){
            return false;
        }
        
    }

}
