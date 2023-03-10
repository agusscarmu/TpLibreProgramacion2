package TP.Condiciones;

import TP.Animal;
import TP.CategoriaAnimal;
import TP.Hacienda;

public class CondicionPorCategoria extends Condicion{

    private CategoriaAnimal categoria;

    public CondicionPorCategoria(CategoriaAnimal categoria){
        this.categoria=categoria;
    }

    public void setCategoria(CategoriaAnimal c){
        categoria=c;
    }

    @Override
    public boolean cumple(Hacienda h) {
        return ((Animal)h).getCategorias().contains(categoria);
    }
    
}
