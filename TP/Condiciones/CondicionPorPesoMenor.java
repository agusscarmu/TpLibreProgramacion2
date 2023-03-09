package TP.Condiciones;

import TP.Hacienda;

public class CondicionPorPesoMenor extends Condicion{

    private float peso;

    public CondicionPorPesoMenor(float peso){
        this.peso=peso;
    }

    public void setCondicionPeso(float p){
        peso=p;
    }

    @Override
    public boolean cumple(Hacienda h) {
        return h.getPesoComparable()<peso;
    }
    
}
