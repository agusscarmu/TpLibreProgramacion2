package TP;

import java.util.ArrayList;

import TP.Condiciones.Condicion;

public class Animal extends Hacienda{

    private int identificador,ternerosParidos,edad;
    private float peso;
    private String raza;
    private boolean macho;
    private boolean capado;
    private ArrayList<CategoriaAnimal> categorias;
    private SistemaGanadero sistema = SistemaGanadero.getInstance();
    
    
    public Animal(int identificador, int ternerosParidos, int edad, float peso, String raza, boolean macho,
    boolean capado) {
        this.identificador = identificador;
        this.ternerosParidos = ternerosParidos;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
        this.macho = macho;
        this.capado = capado;
        this.categorias = new ArrayList<>();
        sistema.clasificarAnimal(this);
    }
    
    public ArrayList<CategoriaAnimal> getCategorias(){
        ArrayList<CategoriaAnimal> copia = new ArrayList<>(categorias);
        return copia;
    }
    
    public void removeCategoria(CategoriaAnimal c){
        categorias.remove(c);
    }

    public void addCategoria(CategoriaAnimal c){
        if(!categorias.contains(c)){
            categorias.add(c);
        }
    }
    
    // Vuelve a categorizar al animal en base a sus atributos (si estos cambiaron lo vuelve a categorizar)
    public void categorizarAnimal() {
        sistema.clasificarAnimal(this);
    }


    public int getTernerosParidos() {
        return ternerosParidos;
    }


    public int getEdad() {
        return edad;
    }


    public float getPeso() {
        return peso;
    }


    public String getRaza() {
        return raza;
    }

    
    public boolean esMacho() {
        return macho;
    }
    

    public boolean capado() {
        return capado;
    }

    
    public int getIdentificador() {
        return identificador;
    }


    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }



    public void setTernerosParidos(int ternerosParidos) {
        this.ternerosParidos = ternerosParidos;
        categorizarAnimal();
    }



    public void setEdad(int edad) {
        this.edad = edad;
        categorizarAnimal();
    }
    


    public void setPeso(float peso) {
        this.peso = peso;
        categorizarAnimal();
    }


    public void setRaza(String raza) {
        this.raza = raza;
        categorizarAnimal();
    }



    public void setSexo(boolean macho) {
        this.macho = macho;
        categorizarAnimal();
    }



    public void setCapado(boolean capado) {
        this.capado = capado;
        categorizarAnimal();
    }

    @Override
    public int getCantidadAnimales() {
        return 1;
    }

    // Si cumple con la condicion retorno el animal en el arreglo, sino devuelvo el arreglo vacio
    @Override
    public ArrayList<Animal> ganadoCumple(Condicion c) {
        ArrayList<Animal>g=new ArrayList<>();
        if(c.cumple(this)){
            g.add(this);
        }
        return g;
    }

    // Pesa al animal en base a su identificador
    @Override
    public void balanzaAlPaso(int id, int peso) {
        if(identificador==id){
            this.setPeso(peso);
        }
    }

    @Override
    public ArrayList<Animal>getAnimales(){
        ArrayList<Animal>a=new ArrayList<>();
        a.add(this);
        return a;
    }

    
    @Override
    public boolean darDeBajaGanado(ArrayList<Animal> a) {
        return a.contains(this);
    }
    

    // Funcion unicamente visual para toString()
    public String MachoHembra(){
        if(esMacho()){
            return "Macho";
        }else{
            return "Hembra";
        }
    }

    @Override
    public String toString() {
        return "\nIdentificador: "+identificador+",Raza: "+raza+",Edad: "+edad+",Peso: "+peso+",Sexo: "+MachoHembra()+",Categorias: "+getCategorias().toString();
    }

}
