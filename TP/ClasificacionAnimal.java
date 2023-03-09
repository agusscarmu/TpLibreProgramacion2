package TP;

import java.util.ArrayList;

import TP.Condiciones.Condicion;

public class ClasificacionAnimal {
    private ArrayList<Animal>animales;
    private String nombreClasificacion;
    private Condicion condicion;

    public ClasificacionAnimal(String nombreClasificacion, Condicion condicion){
        this.animales=new ArrayList<>();
        this.nombreClasificacion=nombreClasificacion;
        this.condicion=condicion;
    }

    public String getNombreClasificacion(){
        return nombreClasificacion;
    }

    public void setNombreClasificacion(String nombre){
        nombreClasificacion=nombre;
    }

    public Condicion getCondicion(){
        return condicion;
    }

    public void setCondicion(Condicion c){
        condicion=c;
    }

    // Comprueba si el animal enviado cumple con la condicion de la clasificacion actual y la agrega a la lista
    public void comprobar(Animal a){
        if(condicion.cumple(a)){
            animales.add(a);
        }
    }

    public ArrayList<Animal> getAnimales(){
        ArrayList<Animal>animalesCopia=new ArrayList<>(animales);
        return animalesCopia;
    }

    @Override
    public String toString() {
        return "\n\nClasificacion: "+nombreClasificacion+",Animales: "+animales;
    }
}
