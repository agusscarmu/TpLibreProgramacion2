package TP.Condiciones;

import TP.Animal;
import TP.Hacienda;
import TP.Animal.Sexo;

public class CondicionPorSexo extends Condicion{
    
    private Sexo sexo;

    public CondicionPorSexo(Sexo sexo){
        this.sexo=sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean cumple(Hacienda h) {
        return ((Animal)h).getSexo().equals(sexo);
    }

}
