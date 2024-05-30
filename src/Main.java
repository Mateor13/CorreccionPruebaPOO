public class Main {
    public static void main(String[] args) {

        //Primera Parte
        Hoteles hotel1=new Hoteles(20,"La Mar","6 de Diciembre",4.5,10);
        Hoteles hotel2=new Hoteles(30,"La Paz","La Marin",4.00,10);
        Hoteles hotel3=new Hoteles(40,"La Rosa","Andres de Zuñiga",3.5,10);
        Hoteles hotel4=new Hoteles(50,"La Casa","Gaspar de Villaroel",5.00,10);
        Hoteles hotel5=new Hoteles(60,"La Tabla","El Montufar",2.5,10);

        //Generar dos objetos con valores nulos
        Hoteles hotel6=new Hoteles();
        Hoteles hotel7=new Hoteles();

        //Settear nombres
        hotel6.setNumHabitaciones(4);
        hotel6.setNombre("Carlos");
        hotel6.setUbicacion("L314 Marin");
        hotel6.setCalificacion(4.5);
        hotel6.setNumPisos(2);

        hotel7.setNumHabitaciones(3);
        hotel7.setNombre("Carmen");
        hotel7.setUbicacion("L134 Mar de Plata");
        hotel7.setCalificacion(4.0);
        hotel7.setNumPisos(3);

        //Editar Datos
        String nombre1 = "Marrior", direccion1 = "Shirys", nombre2 = "Oro", direccion2 = "La Prensa", nombre3 = "Rey", direccion3 = "Pinos";
        int numHabitaciones1 = 10, numHabitaciones2 = 20, numHabitaciones3 = 30, numPiso1 = 10, numPiso2 = 20, numPiso3 = 20;
        Double calificacion1 = 15.0, calificacion2 = 30.0, calificacion3 = 25.0;
        hotel1.editarDatos(numHabitaciones1,nombre1, direccion1,calificacion1,numPiso1);
        hotel6.editarDatos(numHabitaciones2,nombre2, direccion2,calificacion2,numPiso2);
        hotel7.editarDatos(numHabitaciones3,nombre3, direccion3,calificacion3,numPiso3);

        //Mostrar Datos
        hotel1.imprimirDatos();
        hotel2.imprimirDatos();
        hotel3.imprimirDatos();
        hotel4.imprimirDatos();
        hotel5.imprimirDatos();
        hotel6.imprimirDatos();
        hotel7.imprimirDatos();
        //hacer datos nulos e imprimirlos
        hotel1.datosNulos();
        hotel2.datosNulos();
        hotel3.datosNulos();
    }
}