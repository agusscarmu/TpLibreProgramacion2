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
    public float getEdadComparable(){
        return (float)getEdad()/getCantidadAnimales();
    }

    @Override
    public int getEdad(){
        int edad=0;
        for(Hacienda g:ganado){
            edad+=g.getEdad();                                     //CONTROLAR!
        }
        return edad;
    }
    
   
    // Obtengo el peso promedio de todos los animales
    public float getPesoComparable() {
        return getPeso()/getCantidadAnimales();
    }

    @Override
    //Obtengo el total de los pesos de los animales
    public float getPeso(){
        int peso=0;
        for(Hacienda g:ganado){
            peso+=g.getPeso();
        }
        return peso;
    }

    // Corrobora si el Rodeo/Establecimiento/Empresa esa lista para la venta con la condicion establecida
    public boolean listoParaVenta(Condicion c){
        return c.cumple(this);
    }

    /*
    eliminarGanado lo que hace es hacer una copia exacta de la estructura de la que se llama pero sin
    incluir los elementos de "a", los cuales son los animales que ya fueron cargados en el camion.
    */
    @Override
    public Hacienda eliminarGanado(ArrayList<Animal> a){
        ArrayList<Hacienda> ganadoNoEliminado = new ArrayList<>();
        for(Hacienda g:ganado){
            Hacienda noEliminado = g.eliminarGanado(a);
            if(noEliminado!=null){
                ganadoNoEliminado.add(noEliminado);
            }
        }
        Hacienda copiaClase = newInstance();
        for(Hacienda g:ganadoNoEliminado){
            ((Rodeo)copiaClase).addGanado(g);
        }
        return copiaClase;
    }

    /*
    Una vez cargados en el camion se dan de baja los animales cargados
    Para esto la Lista "ganado" toma el valor de la lista de la funcion "eliminarGanado" en donde se 'eliminan' los
    animales que fueron cargados 
    */
    public void darDeBajaGanados(ArrayList<Animal>carga){
        ganado=((Rodeo)eliminarGanado(carga)).getGanado();
    }

    @Override
    // carga el camion la cantidad de veces solicitada en Hacienda junto a una condicion
    public ArrayList<Animal> cargar(Condicion c) {
        ArrayList<Animal> ganadoListo=new ArrayList<>();
        for(Hacienda g:ganado){
            ganadoListo.addAll(g.cargar(c));
        }
        return ganadoListo;
    }

    @Override
    // La balanza al paso me trae el peso y el identificador del animal para pesarlo automaticamente
    public void balanzaAlPaso(int identificador, int peso) {
        for(Hacienda g:ganado){
            g.balanzaAlPaso(identificador, peso);
        }
    }

    public Hacienda newInstance(){
        return new Rodeo();
    }

}