package TP.Condiciones;

import TP.Animal;
import TP.CategoriaAnimal;

public class CondicionPorCategoria extends CondicionAnimal{

    private CategoriaAnimal categoria;

    public CondicionPorCategoria(CategoriaAnimal categoria){
        this.categoria=categoria;
    }

    public void setCategoria(CategoriaAnimal c){
        categoria=c;
    }

    @Override
    public boolean cumple(Animal h) {
        return h.getCategorias().contains(categoria);        
    }
    
}
