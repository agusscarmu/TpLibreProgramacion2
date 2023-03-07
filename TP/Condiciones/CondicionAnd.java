package TP.Condiciones;

import TP.Hacienda;

public class CondicionAnd extends Condicion{
    
    private Condicion c1,c2;

    public CondicionAnd(Condicion c1, Condicion c2){
        this.c1=c1;
        this.c2=c2;
    }

    public void setCondicion1(Condicion c){
        c1=c;
    }
    public void setCondicion2(Condicion c){
        c2=c;
    }
    
    @Override
    public boolean cumple(Hacienda h) {
        return c1.cumple(h) && c2.cumple(h);
    }
}
