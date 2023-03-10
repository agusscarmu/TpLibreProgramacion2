package TP;

import java.util.ArrayList;

import TP.Condiciones.Condicion;

public class CamionDeVenta {
    private int capacidadDeCarga;
    private Condicion condicionDeCarga;
    private ArrayList<Animal> carga;

    public CamionDeVenta(int capacidadDeCarga, Condicion condicionDeCarga){
        this.capacidadDeCarga=capacidadDeCarga;
        this.condicionDeCarga=condicionDeCarga;
        this.carga=new ArrayList<>();
    }   

    public ArrayList<Animal> verCarga(){
        ArrayList<Animal>cargaCopia=new ArrayList<>(carga);
        return cargaCopia;
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
    public void cargarCamion(Rodeo ganado){
        carga = ganado.llenarCamion(capacidadDeCarga, condicionDeCarga);
        ganado.darDeBajaGanado(carga);
    }

    // Descarga del camion eliminando todos los animales que este incluia
    public void descargarCamion(){
        carga.removeAll(carga);
    }
}
