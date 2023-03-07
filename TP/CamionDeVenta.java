package TP;

import java.util.ArrayList;

import TP.Condiciones.Condicion;

public class CamionDeVenta {
    private int capacidadDeCarga;
    private Condicion condicionDeCarga;
    private ArrayList<Hacienda> carga;

    public CamionDeVenta(int capacidadDeCarga, Condicion condicionDeCarga){
        this.capacidadDeCarga=capacidadDeCarga;
        this.condicionDeCarga=condicionDeCarga;
        this.carga=new ArrayList<>();
    }

    public void setCapacidadDeCarga(int c){
        capacidadDeCarga=c;
    }

    public void setCondicionDeCarga(Condicion c){
        condicionDeCarga=c;
    }

    public Condicion getCondicion(){
        return condicionDeCarga;
    }

    public int getCapacidadDeCarga(){
        return capacidadDeCarga;
    }

    // Carga este camion enviando las indicaciones de capacidad de carga y la condicion
    // Despues da de baja a los ganados que fueron cargados
    public void cargarCamion(Hacienda ganado){
        carga = ganado.llenarCamion(capacidadDeCarga, condicionDeCarga);
        ((Rodeo)ganado).darDeBajaGanados(carga);
    }

    // Descarga del camion eliminando todos los animales que este incluia
    public void descargarCamion(){
        carga.removeAll(carga);
    }
}
