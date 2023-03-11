package TP;

import java.util.ArrayList;

public class SistemaGanadero {
    private ArrayList<CategoriaAnimal>clasificaciones;
    private static SistemaGanadero instancia;

    private SistemaGanadero(){
        this.clasificaciones=new ArrayList<>();
    }

    public static SistemaGanadero getInstance(){
        if(instancia==null){
            instancia=new SistemaGanadero();
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
