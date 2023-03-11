package TP;

import java.util.ArrayList;

import TP.Condiciones.Condicion;

public class CategoriaAnimal {
    private String nombreCategoria;
    private Condicion condicion;
    private ArrayList<Animal> animalesCategoria;

    public CategoriaAnimal(String nombreCategoria, Condicion condicion){
        this.nombreCategoria=nombreCategoria;
        this.condicion=condicion;
        this.animalesCategoria=new ArrayList<>();
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
        reclasificar();
    }

    public void reclasificar(){
        for(int i=0;i<animalesCategoria.size();i++){
            animalesCategoria.get(i).categorizarAnimal();
        }
    }

    // Comprueba si el animal enviado cumple con la condicion de la categoria actual y lo clasifica
    public void comprobar(Animal a){
        if(condicion.cumple(a)){
            a.addCategoria(this);
            animalesCategoria.add(a);
        }else{ 
            if(a.getCategorias().contains(this)){     // <- Controla si el animal no cumple con la condicion y contiene la categoria
                a.removeCategoria(this);              // <- De ser asi la categoria es eliminada del animal  
                animalesCategoria.remove(a);
            }
        } 
    }

    @Override
    public String toString() {
        return "\nCategoria: "+nombreCategoria;
    }
}
