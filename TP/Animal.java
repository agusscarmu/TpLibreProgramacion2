package TP;

import java.util.ArrayList;

import TP.Condiciones.Condicion;

public class Animal extends Hacienda{
    public enum Sexo{
        Macho,
        Hembra
    }

    private int identificador,ternerosParidos,edad;
    private float peso;
    private String raza;
    private Sexo sexo;
    private boolean capado;
    
    public Animal(int identificador, int ternerosParidos, int edad, float peso, String raza, Sexo sexo,
            boolean capado) {
        this.identificador = identificador;
        this.ternerosParidos = ternerosParidos;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
        this.sexo = sexo;
        this.capado = capado;
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

    
    public Sexo getSexo() {
        return sexo;
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
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }
    


    public void setPeso(float peso) {
        this.peso = peso;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }



    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }



    public void setCapado(boolean capado) {
        this.capado = capado;
    }

    @Override
    public int getCantidadAnimales() {
        return 1;
    }


    @Override
    // Si cumple con la condicion retorno el animal en el arreglo, sino devuelvo el arreglo vacio
    public ArrayList<Hacienda> llenarCamion(Condicion c) {
        ArrayList<Hacienda>g=new ArrayList<>();
        if(c.cumple(this)){
            g.add(this);
        }
        return g;
    }
}
