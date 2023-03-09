package TP;

import java.util.ArrayList;

import TP.Condiciones.Condicion;

public abstract class Hacienda {
    

    public abstract int getCantidadAnimales();
    public abstract int getEdad();
    public abstract float getEdadComparable();
    public abstract float getPeso();
    public abstract float getPesoComparable();
    public abstract void balanzaAlPaso(int identificador, int peso);
    public abstract ArrayList<Animal> getAnimales();
    public abstract Hacienda eliminarGanado(ArrayList<Animal> a);
    public abstract Hacienda newInstance();

    // Llama a la funcion llenarCamion la cantidad de veces necesarias que es igual a la capacidad maxima del camion
    public ArrayList<Animal> llenarCamion(int capacidad, Condicion c){
        ArrayList<Animal>g = new ArrayList<>(this.cargar(c));
        ArrayList<Animal>animales=new ArrayList<>();
        for(int i=0;i<g.size() && animales.size()<capacidad;i++){
            animales.add(g.get(i));
        }
        return animales;
    }

    public abstract ArrayList<Animal> cargar(Condicion c);
}
