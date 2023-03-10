package TP;

import java.util.ArrayList;

public class Ministerio {
    private ArrayList<CategoriaAnimal>clasificaciones;
    private static Ministerio instancia;

    private Ministerio(){
        this.clasificaciones=new ArrayList<>();
    }

    public static Ministerio getInstance(){
        if(instancia==null){
            instancia=new Ministerio();
        }
        return instancia;
    }
    
    public void agregarClasificacion(CategoriaAnimal clasificacion){
        clasificaciones.add(clasificacion);
    }

    public void borrarClasificacion(CategoriaAnimal clasificacion){
        clasificaciones.remove(clasificacion);
    }

    // Clasificar un animal dentro de todas las clasificaciones (cargadas previamente) posibles
    public void clasificarAnimal(Animal animal){
        for(CategoriaAnimal c:clasificaciones){
            c.comprobar(animal);
        }
    }

}
