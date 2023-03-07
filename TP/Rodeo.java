package TP;
import java.util.ArrayList;

import TP.Condiciones.Condicion;

public class Rodeo extends Hacienda{

    private ArrayList<Hacienda>ganado;

    public Rodeo(){
        this.ganado=new ArrayList<>();
    }

    public void addGanado(Hacienda g){
        ganado.add(g);
    }
    
    public ArrayList<Hacienda> getGanado(){
        ArrayList<Hacienda> ganadoCopia = new ArrayList<>(ganado);
        return ganadoCopia;
    }

    @Override
    // Obtengo la cantidad total de animales
    public int getCantidadAnimales(){
        int cantidad=0;
        for(Hacienda g:ganado){
            cantidad+=g.getCantidadAnimales();
        }
        return cantidad;
    }

    @Override
    //Obtengo el promedio de las edades de los animales
    public int getEdad(){
        int promedio=0;
        for(Hacienda g:ganado){
            promedio+=g.getEdad();
        }
        promedio/=getCantidadAnimales();
        return promedio;
    }

    @Override
    //Obtengo el promedio de los pesos de los animales
    public float getPeso() {
        int peso=0;
        for(Hacienda g:ganado){
            peso+=g.getPeso();
        }
        peso/=getCantidadAnimales();
        return peso;
    }
    
    // Obtengo el peso total de todos los animales
    public float getPesoTotal(){
        float pesoTotal = getPeso()*getCantidadAnimales();
        return pesoTotal;
    }

    // Corrobora si el Rodeo/Establecimiento/Empresa esa lista para la venta con la condicion establecida
    public boolean listoParaVenta(Condicion c){
        return c.cumple(this);
    }

    // Una vez cargados en el camion se dan de baja los ganados cargados
    public void darDeBajaGanados(ArrayList<Hacienda>carga){
        for(Hacienda c:carga){
            ganado.remove(c);
        }
    }

    @Override
    // carga el camion la cantidad de veces solicitada en Hacienda junto a una condicion
    public ArrayList<Hacienda> llenarCamion(Condicion c) {
        ArrayList<Hacienda>ganadoListo=new ArrayList<>();
        for(Hacienda g:ganado){
            ganadoListo.addAll(g.llenarCamion(c));
        }
        return ganadoListo;
    }



}