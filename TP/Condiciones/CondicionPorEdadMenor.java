package TP.Condiciones;

import TP.Hacienda;

public class CondicionPorEdadMenor extends Condicion{
    
    private int edad;

    public CondicionPorEdadMenor(int edad){
        this.edad=edad;
    }

    public void setCondicionEdad(int e){
        edad=e;
    }

    @Override
    public boolean cumple(Hacienda h) {
        return h.getEdadComparable()<edad;
    }
}
