package TP.Condiciones;

import TP.Animal;
import TP.Hacienda;

public class CondicionPorTernerosParidosMenor extends Condicion{
    private int ternerosParidos;

    public CondicionPorTernerosParidosMenor(int ternerosParidos){
        this.ternerosParidos=ternerosParidos;
    }

    public int getTernerosParidos() {
        return ternerosParidos;
    }

    public void setTernerosParidos(int ternerosParidos) {
        this.ternerosParidos = ternerosParidos;
    }

    @Override
    public boolean cumple(Hacienda h) {
        try{
            return ((Animal)h).getTernerosParidos()<ternerosParidos;
        }catch(Exception e){
            return false;
        }
        
    }


}
