package TP.Condiciones;

import TP.Animal;

public class CondicionPorRaza extends CondicionAnimal{
    private String raza;

    public CondicionPorRaza(String raza){
        this.raza=raza;
    }

    @Override
    public boolean cumple(Animal h) {
        return h.getRaza().equals(raza);
    }
    
}
