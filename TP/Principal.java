package TP;

import TP.Condiciones.Condicion;
import TP.Condiciones.CondicionAnd;
import TP.Condiciones.CondicionCapado;
import TP.Condiciones.CondicionNot;
import TP.Condiciones.CondicionOr;
import TP.Condiciones.CondicionPorCategoria;
import TP.Condiciones.CondicionPorEdadMenor;
import TP.Condiciones.CondicionPorMacho;
import TP.Condiciones.CondicionPorPesoMenor;
import TP.Condiciones.CondicionPorRaza;
import TP.Condiciones.CondicionPorTernerosParidosMenor;

public class Principal {
    
    public static void main(String[]args){
        
        // CARGA DE CONDICIONES
        Condicion cEdadMenor = new CondicionPorEdadMenor(25);
        Condicion cMacho = new CondicionPorMacho();
        Condicion cPesoMenor = new CondicionPorPesoMenor(470);
        Condicion cPorRaza = new CondicionPorRaza("Brangus");
        Condicion cPorParidos = new CondicionPorTernerosParidosMenor(3);
        Condicion cCapado = new CondicionCapado();
        Condicion cAnd = new CondicionAnd(cEdadMenor, cMacho);
        Condicion cOr = new CondicionOr(cPorRaza, cCapado);
        Condicion cNot = new CondicionNot(cMacho);
        
        // CARGA DE CAMIONES
        CamionDeVenta camion1 = new CamionDeVenta(5, cNot);
        CamionDeVenta camion2 = new CamionDeVenta(4, cEdadMenor);
        CamionDeVenta camion3 = new CamionDeVenta(6, cPesoMenor);
        CamionDeVenta camion4 = new CamionDeVenta(8, cMacho);
        CamionDeVenta camion5 = new CamionDeVenta(6, cPorParidos);
        
        // CARGA DE CONDICIONES PARA CATEGORIAS
        Condicion condicionLechal = new CondicionPorEdadMenor(8);
        Condicion condicionMayor1 = new CondicionNot(condicionLechal);
        Condicion condicionT = new CondicionPorEdadMenor(12);
        Condicion condicionTernero = new CondicionAnd(condicionT, condicionMayor1);
        Condicion condicionMayorAlAnio = new CondicionNot(condicionT);
        Condicion condicionT2 = new CondicionPorEdadMenor(24);
        Condicion condicionAniojo = new CondicionAnd(condicionMayorAlAnio, condicionT2);
        Condicion condicionMayor3 = new CondicionNot(new CondicionPorEdadMenor(24));
        Condicion condicionCebon = new CondicionAnd(new CondicionAnd(new CondicionPorEdadMenor(48), condicionMayorAlAnio), cCapado);
        Condicion condicionNovillo = new CondicionAnd(condicionMayor3, condicionCebon);
        Condicion condicionVacas = new CondicionAnd(new CondicionNot(new CondicionPorEdadMenor(15)),new CondicionNot(cMacho));
        Condicion ternerosParidos= new CondicionPorTernerosParidosMenor(1);
        Condicion condicionVaquillona = new CondicionAnd(condicionVacas, ternerosParidos);
        Condicion condicionVaca = new CondicionAnd(condicionVacas, new CondicionNot(new CondicionPorTernerosParidosMenor(1)));
        Condicion condicionBuey = new CondicionAnd(new CondicionNot(condicionCebon), new CondicionCapado());
        Condicion condicionToro = new CondicionAnd(new CondicionNot(new CondicionCapado()), new CondicionPorMacho());
        
        // CARGA DE CATEGORIAS
        CategoriaAnimal Lechal = new CategoriaAnimal("Lechal", condicionLechal);
        CategoriaAnimal Ternero = new CategoriaAnimal("Ternero", condicionTernero);
        CategoriaAnimal Aniojo = new CategoriaAnimal("Aniojo", condicionAniojo);
        CategoriaAnimal Cebon = new CategoriaAnimal("Cebon", condicionCebon);
        CategoriaAnimal Novillo = new CategoriaAnimal("Novillo", condicionNovillo);
        CategoriaAnimal Vaquillona = new CategoriaAnimal("Vaquillona", condicionVaquillona);
        CategoriaAnimal Vaca = new CategoriaAnimal("Vaca", condicionVaca);
        CategoriaAnimal Buey = new CategoriaAnimal("Buey", condicionBuey);
        CategoriaAnimal Toro = new CategoriaAnimal("Toro", condicionToro);
        
        // CONDICION POR CATEGORIA
        Condicion condicionPorCategoria = new CondicionPorCategoria(Toro);
        
        CamionDeVenta camionEspecial = new CamionDeVenta(6, cPorRaza);
        
        // PRIMER INSTANCIA DE MINISTERIO (a partir de ahora queda instanciado)
        SistemaGanadero ministerio = SistemaGanadero.getInstance();
        
        ministerio.agregarClasificacion(Lechal);
        ministerio.agregarClasificacion(Ternero);
        ministerio.agregarClasificacion(Aniojo);
        ministerio.agregarClasificacion(Cebon);
        ministerio.agregarClasificacion(Novillo);
        ministerio.agregarClasificacion(Vaquillona);
        ministerio.agregarClasificacion(Vaca);
        ministerio.agregarClasificacion(Buey);
        ministerio.agregarClasificacion(Toro);
        
        // CARGA DE RODEOS
        Rodeo establecimiento = new Rodeo();
        Rodeo establecimiento1 = new Rodeo();
        Rodeo establecimiento2 = new Rodeo();
        Rodeo rodeo1 = new Rodeo();
        Rodeo rodeo2 = new Rodeo();
        Rodeo rodeo3 = new Rodeo();
        Rodeo rodeo4 = new Rodeo();
        Rodeo rodeo5 = new Rodeo();

        // CARGA DE ANIMALES
        Animal animal1 = new Animal(12, 0, 8, 120, "Jersey", false, false);
        Animal animal2 = new Animal(13, 2, 31, 800, "Jersey", false, false);
        Animal animal3 = new Animal(14, 4, 8, 100, "Brangus", false, false);
        Animal animal4 = new Animal(16, 0, 8, 100, "Angus", true, false);
        Animal animal5 = new Animal(17, 0, 28, 890, "Hereford", true, true);
        Animal animal6 = new Animal(17, 0, 29, 880, "Hereford", true, false);
        Animal animal7 = new Animal(118, 0, 8, 100, "Jersey", false, false);
        Animal animal8 = new Animal(19, 0, 5, 60, "Angus", true, false);
        Animal animal9 = new Animal(20, 0, 4, 50, "Angus", true, false);
        Animal animal10 = new Animal(132, 0, 38, 1000, "Angus", true, true);
        Animal animal11 = new Animal(142, 2, 15, 500, "Hereford", true, true);
        Animal animal12 = new Animal(152, 0, 28, 805, "Hereford", true, true);
        Animal animal13 = new Animal(126, 0, 18, 570, "Jersey", false, false);
        Animal animal14 = new Animal(127, 0, 10, 340, "Brangus", false, false);
        Animal animal15 = new Animal(128, 5, 59, 750, "Brangus", false, false);

        
        establecimiento1.addGanado(rodeo1);
        establecimiento1.addGanado(rodeo2);
        establecimiento1.addGanado(rodeo3);
        establecimiento2.addGanado(rodeo4);
        establecimiento2.addGanado(rodeo5);
        
        establecimiento.addGanado(establecimiento1);
        establecimiento.addGanado(establecimiento2);
        
        rodeo1.addGanado(animal1);
        rodeo1.addGanado(animal2);
        rodeo1.addGanado(animal3);
        rodeo2.addGanado(animal4);
        rodeo2.addGanado(animal5);
        rodeo2.addGanado(animal6);
        rodeo3.addGanado(animal7);
        rodeo3.addGanado(animal8);
        rodeo4.addGanado(animal9);
        rodeo4.addGanado(animal10);
        rodeo4.addGanado(animal11);
        rodeo5.addGanado(animal12);
        rodeo5.addGanado(animal13);
        rodeo5.addGanado(animal14);
        rodeo5.addGanado(animal15);

        System.out.println(cPorRaza.cumple(rodeo1));
    }
}
