package TP.Condiciones;

import TP.Animal;

public class CondicionPorMacho extends CondicionAnimal{

    @Override
    public boolean cumple(Animal h) {
            return h.esMacho();  
    }

}
