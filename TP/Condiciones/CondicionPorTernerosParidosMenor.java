package TP.Condiciones;

import TP.Animal;

public class CondicionPorTernerosParidosMenor extends CondicionAnimal{
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
    public boolean cumple(Animal h){
        return h.getTernerosParidos()<ternerosParidos;
        
    }


}
