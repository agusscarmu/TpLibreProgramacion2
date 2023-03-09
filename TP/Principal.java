package TP;

import TP.Condiciones.Condicion;
import TP.Condiciones.CondicionAnd;
import TP.Condiciones.CondicionCapado;
import TP.Condiciones.CondicionNot;
import TP.Condiciones.CondicionOr;
import TP.Condiciones.CondicionPorEdadMenor;
import TP.Condiciones.CondicionPorMacho;
import TP.Condiciones.CondicionPorPesoMenor;
import TP.Condiciones.CondicionPorRaza;
import TP.Condiciones.CondicionPorTernerosParidosMenor;

public class Principal {
    
    public static void main(String[]args){
        Rodeo establecimiento = new Rodeo();
        Rodeo establecimiento1 = new Rodeo();
        Rodeo establecimiento2 = new Rodeo();
        Rodeo rodeo1 = new Rodeo();
        Rodeo rodeo2 = new Rodeo();
        Rodeo rodeo3 = new Rodeo();
        Rodeo rodeo4 = new Rodeo();
        Rodeo rodeo5 = new Rodeo();

        Animal animal1 = new Animal(12, 0, 8, 120, "Jersey", false, false);
        Animal animal2 = new Animal(13, 1, 31, 800, "Jersey", false, false);
        Animal animal3 = new Animal(14, 4, 8, 100, "Brangus", false, false);
        Animal animal4 = new Animal(16, 0, 8, 100, "Angus", true, false);
        Animal animal5 = new Animal(17, 0, 28, 890, "Hereford", true, true);
        Animal animal6 = new Animal(17, 0, 29, 880, "Hereford", true, false);
        Animal animal7 = new Animal(118, 3, 8, 100, "Jersey", false, false);
        Animal animal8 = new Animal(19, 0, 5, 60, "Angus", true, false);
        Animal animal9 = new Animal(20, 0, 4, 50, "Angus", true, false);
        Animal animal10 = new Animal(132, 0, 38, 1000, "Angus", true, true);
        Animal animal11 = new Animal(142, 2, 15, 500, "Hereford", true, false);
        Animal animal12 = new Animal(152, 0, 28, 805, "Hereford", true, true);
        Animal animal13 = new Animal(126, 0, 18, 570, "Jersey", false, false);
        Animal animal14 = new Animal(127, 1, 10, 340, "Brangus", false, false);
        Animal animal15 = new Animal(128, 5, 59, 750, "Brangus", false, false);

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
        
        establecimiento1.addGanado(rodeo1);
        establecimiento1.addGanado(rodeo2);
        establecimiento1.addGanado(rodeo3);
        establecimiento2.addGanado(rodeo4);
        establecimiento2.addGanado(rodeo5);

        establecimiento.addGanado(establecimiento1);
        establecimiento.addGanado(establecimiento2);

        Condicion cEdadMenor = new CondicionPorEdadMenor(20);
        Condicion cMacho = new CondicionPorMacho();
        Condicion cPesoMenor = new CondicionPorPesoMenor(600);
        Condicion cPorRaza = new CondicionPorRaza("Angus");
        Condicion cPorParidos = new CondicionPorTernerosParidosMenor(3);
        Condicion cCapado = new CondicionCapado();
        Condicion cAnd = new CondicionAnd(cEdadMenor, cMacho);
        Condicion cOr = new CondicionOr(cPorRaza, cCapado);
        Condicion cNot = new CondicionNot(cMacho);
        
        CamionDeVenta camion1 = new CamionDeVenta(5, cNot);
        CamionDeVenta camion2 = new CamionDeVenta(4, cEdadMenor);
        CamionDeVenta camion3 = new CamionDeVenta(6, cPesoMenor);
        CamionDeVenta camion4 = new CamionDeVenta(8, cMacho);
        CamionDeVenta camion5 = new CamionDeVenta(6, cPorParidos);

        Ministerio ministerio = new Ministerio();

        Condicion condicionLechal = new CondicionPorEdadMenor(8);
                Condicion condicionMayor1 = new CondicionNot(condicionLechal);
                Condicion condicionT = new CondicionPorEdadMenor(12);
        Condicion condicionTernero = new CondicionAnd(condicionT, condicionMayor1);
                Condicion condicionMayor2 = new CondicionNot(condicionT);
                Condicion condicionT2 = new CondicionPorEdadMenor(24);
        Condicion condicionAniojo = new CondicionAnd(condicionMayor2, condicionT2);
                Condicion condicionMayor3 = new CondicionNot(new CondicionPorEdadMenor(24));
        Condicion condicionCebon = new CondicionPorEdadMenor(48);
        Condicion condicionNovillo = new CondicionAnd(condicionMayor3, condicionCebon);
                Condicion condicionVacas = new CondicionNot(new CondicionPorEdadMenor(15));
                Condicion ternerosParidos= new CondicionAnd(new CondicionPorTernerosParidosMenor(1), new CondicionNot(cMacho));
        Condicion condicionVaquillona = new CondicionAnd(condicionVacas, ternerosParidos);
        Condicion condicionVaca = new CondicionAnd(new CondicionAnd(condicionVacas, new CondicionNot(cMacho)), new CondicionNot(new CondicionPorTernerosParidosMenor(1)));
        Condicion condicionBuey = new CondicionAnd(new CondicionNot(condicionCebon), new CondicionCapado());
        Condicion condicionToro = new CondicionAnd(new CondicionNot(new CondicionCapado()), new CondicionPorMacho());

        ClasificacionAnimal Lechal = new ClasificacionAnimal("Lechal", condicionLechal);
        ClasificacionAnimal Ternero = new ClasificacionAnimal("Ternero", condicionTernero);
        ClasificacionAnimal Aniojo = new ClasificacionAnimal("Aniojo", condicionAniojo);
        ClasificacionAnimal Cebon = new ClasificacionAnimal("Cebon", condicionCebon);
        ClasificacionAnimal Novillo = new ClasificacionAnimal("Novillo", condicionNovillo);
        ClasificacionAnimal Vaquillona = new ClasificacionAnimal("Vaquillona", condicionVaquillona);
        ClasificacionAnimal Vaca = new ClasificacionAnimal("Vaca", condicionVaca);
        ClasificacionAnimal Buey = new ClasificacionAnimal("Buey", condicionBuey);
        ClasificacionAnimal Toro = new ClasificacionAnimal("Toro", condicionToro);

        ministerio.agregarClasificacion(Lechal);
        ministerio.agregarClasificacion(Ternero);
        ministerio.agregarClasificacion(Aniojo);
        ministerio.agregarClasificacion(Cebon);
        ministerio.agregarClasificacion(Novillo);
        ministerio.agregarClasificacion(Vaquillona);
        ministerio.agregarClasificacion(Vaca);
        ministerio.agregarClasificacion(Buey);
        ministerio.agregarClasificacion(Toro);

        int cantidadDeAnimales=establecimiento1.getCantidadAnimales();
        // System.out.println(cantidadDeAnimales);
        float promedioEdad = establecimiento2.getEdadComparable();
        float promedioedad1 = rodeo4.getEdad();
        float promedioedad2 = rodeo5.getEdad();
        // System.out.println(promedioEdad);
        // // System.out.println(promedioedad1);
        // // System.out.println(promedioedad2);
        // // System.out.println(promedioEdad);
        // float peso = establecimiento1.getPesoComparable();
        // System.out.println(peso);
        // Condicion cPMenorPrueba = new CondicionPorPesoMenor(380);
        // Condicion Prueba = new CondicionNot(cPMenorPrueba);
        // System.out.println(establecimiento1.listoParaVenta(cPMenorPrueba));

        // ((CondicionPorPesoMenor)cPMenorPrueba).setCondicionPeso(200);
        // System.out.println(establecimiento1.cargar(cPMenorPrueba));


        // System.out.println();
        // //PRUEBA CARGA Y DESCARGA DEL CAMION
        if(establecimiento.listoParaVenta(cPesoMenor)){
        System.out.println(establecimiento.cargar(cEdadMenor));
        camion2.cargarCamion(establecimiento);
        System.out.println("\n");
        System.out.println("Carga camion: "+camion2.verCarga());
        System.out.println("\n");
        System.out.println(establecimiento.cargar(cEdadMenor));
        camion2.descargarCamion();
        System.out.println("\n");
        camion2.cargarCamion(establecimiento);
        System.out.println("\n");
        System.out.println("Carga camion: "+camion2.verCarga());
        System.out.println("\n");
        System.out.println(establecimiento.cargar(cEdadMenor));
        camion2.descargarCamion();
        System.out.println("\n");
        System.out.println(camion2.verCarga());
        }
        
        for(Animal a:establecimiento.getAnimales()){
            ministerio.clasificarAnimal(a);
        }

        // System.out.println(ministerio);

        

    }
}
