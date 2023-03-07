package TP.Condiciones;

import TP.Hacienda;

public class CondicionNot extends Condicion{
    Condicion c;

    public CondicionNot(Condicion c){
        this.c=c;
    }

    public void setCondicion(Condicion cNueva){
        c=cNueva;
    }

    public Condicion getCondicion(){
        return c;
    }

    @Override
    public boolean cumple(Hacienda h) {
        return !c.cumple(h);
    }

}
