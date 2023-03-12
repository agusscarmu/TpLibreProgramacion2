package TP.Condiciones;

import TP.Animal;

public class CondicionCapado extends CondicionAnimal{

    @Override
    public boolean cumple(Animal h) {
        return h.capado();        
    }
    
}
