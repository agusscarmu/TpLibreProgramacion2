package TP;
import java.util.ArrayList;

import TP.Condiciones.Condicion;

public class Rodeo extends Hacienda{

    private ArrayList<Hacienda>ganado;

    public Rodeo(){
        this.ganado=new ArrayList<>();
    }

    public void addGanado(Hacienda g){
        if(!ganado.contains(g)){
            ganado.add(g);
        }
    }
    
    public ArrayList<Hacienda> getGanado(){
        ArrayList<Hacienda> ganadoCopia = new ArrayList<>(ganado);
        return ganadoCopia;
    }

    @Override
    public ArrayList<Animal> getAnimales(){
        ArrayList<Animal>a=new ArrayList<>();
        for(Hacienda g:ganado){
            a.addAll(g.getAnimales());
        }
        return a;
    }
    @Override
    // Obtengo la cantidad total de animales
    public int getCantidadAnimales(){
        return getAnimales().size();
    }
    

    //Obtengo el promedio de las edades de los animales
    @Override
    public int getEdad(){
        int edad=0;
        for(Animal a:getAnimales()){
            edad+=a.getEdad();                                     
        }
        return edad/getCantidadAnimales();
    }
    
   
    // Obtengo el peso promedio de todos los animales
    @Override
    public float getPeso() {
        return getPesoTotal()/getCantidadAnimales();
    }

    //Obtengo el total de los pesos de los animales
    public float getPesoTotal(){
        int peso=0;
        for(Animal a:getAnimales()){
            peso+=a.getPeso();
        }
        return peso;
    }

    // Corrobora si el Rodeo/Establecimiento/Empresa esa lista para la venta con la condicion establecida
    public boolean listoParaVenta(Condicion c){
        return c.cumple(this);
    }

    /*
    Una vez cargados en el camion se dan de baja los animales cargados
    Para esto recorre la lista ganado y se fija en cada uno de los elementos para ver si esta contemplado dentro de
    la lista "carga" devolviendo true si es asi y eliminandolo
    */
    @Override
    public boolean darDeBajaGanado(ArrayList<Animal>carga){
        for(Hacienda g:ganado){
            if(g.darDeBajaGanado(carga)){
                ganado.remove(g);
            }
        }
        return false;   

        // return ganado.isEmpty(); -> reemplaza 'return false' si quisiera eliminar los rodeos/establecimientos vacios
    }


    // carga el camion la cantidad de veces solicitada en Hacienda junto a una condicion
    @Override
    public ArrayList<Animal> cargar(Condicion c) {
        ArrayList<Animal> ganadoListo=new ArrayList<>();
        for(Hacienda g:ganado){
            ganadoListo.addAll(g.cargar(c));
        }
        return ganadoListo;
    }


    // La balanza al paso me trae el peso y el identificador del animal para pesarlo automaticamente
    @Override
    public void balanzaAlPaso(int identificador, int peso) {
        for(Hacienda g:ganado){
            g.balanzaAlPaso(identificador, peso);
        }
    }

    // Categoriza a cada uno de los animales dependiendo su clasificacion
    @Override
    public void categorizarAnimal(){
        for(Hacienda g:ganado){
            g.categorizarAnimal();
        }
    }

}