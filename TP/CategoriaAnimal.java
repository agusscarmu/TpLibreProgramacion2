package TP;

import TP.Condiciones.Condicion;

public class CategoriaAnimal{
    private String nombreCategoria;
    private Condicion condicion;

    public CategoriaAnimal(String nombreCategoria, Condicion condicion){
        this.nombreCategoria=nombreCategoria;
        this.condicion=condicion;
    }

    public String getNombreCategoria(){
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombre){
        nombreCategoria=nombre;
    }

    public Condicion getCondicion(){
        return condicion;
    }

    public void setCondicion(Condicion c){
        condicion=c;
    }

    // Comprueba si el animal enviado cumple con la condicion de la categoria actual y lo clasifica
    public void comprobar(Animal a){
        if(condicion.cumple(a)){
            a.addCategoria(this);
        }else{ 
            if(a.getCategorias().contains(this)){     // <- Controla si el animal no cumple con la condicion y contiene la categoria
                a.removeCategoria(this);              // <- De ser asi la categoria es eliminada del animal  
            }
        } 
    }

    @Override
    public String toString() {
        return "\nCategoria: "+nombreCategoria;
    }
}
