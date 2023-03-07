package TP;

import java.util.ArrayList;

public class Ministerio {
    ArrayList<ClasificacionAnimal>clasificaciones;

    public void agregarClasificacion(ClasificacionAnimal clasificacion){
        clasificaciones.add(clasificacion);
    }

    public void borrarClasificacion(ClasificacionAnimal clasificacion){
        clasificaciones.remove(clasificacion);
    }

    // Clasificar un animal dentro de todas las clasificaciones (cargadas previamente) posibles
    public void clasificarAnimal(Animal animal){
        for(ClasificacionAnimal c:clasificaciones){
            c.comprobar(animal);
        }
    }
}
