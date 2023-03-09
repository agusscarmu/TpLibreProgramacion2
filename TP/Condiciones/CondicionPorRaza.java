package TP.Condiciones;

import TP.Animal;
import TP.Hacienda;

public class CondicionPorRaza extends Condicion{
    private String raza;

    public CondicionPorRaza(String raza){
        this.raza=raza;
    }

    @Override
    public boolean cumple(Hacienda h) {
        return ((Animal)h).getRaza().equals(raza);
    }
    
}
