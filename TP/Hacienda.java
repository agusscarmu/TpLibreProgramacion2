package TP;

import java.util.ArrayList;

import TP.Condiciones.Condicion;

public abstract class Hacienda {
    

    public abstract int getCantidadAnimales();
    public abstract int getEdad();
    public abstract float getPeso();

    // Llama a la funcion llenarCamion la cantidad de veces necesarias que es igual a la capacidad maxima del camion
    public ArrayList<Hacienda> llenarCamion(int capacidad, Condicion c){
        ArrayList<Hacienda>g = new ArrayList<>();
        for(int i=0;i<capacidad;i++){
            g.addAll(this.llenarCamion(c));
        }
        return g;
    }

    public abstract ArrayList<Hacienda> llenarCamion(Condicion c);
}
