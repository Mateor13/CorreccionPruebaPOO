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

        //Setear a null 3 hoteles
        hotel1.setNumHabitaciones(0);
        hotel1.setNombre(null);
        hotel1.setUbicacion(null);
        hotel1.setCalificacion(null);
        hotel1.setNumPisos(0);

        hotel6.setNumHabitaciones(0);
        hotel6.setNombre(null);
        hotel6.setUbicacion(null);
        hotel6.setCalificacion(null);
        hotel6.setNumPisos(0);

        hotel7.setNumHabitaciones(0);
        hotel7.setNombre(null);
        hotel7.setUbicacion(null);
        hotel7.setCalificacion(null);
        hotel7.setNumPisos(0);

        //Editar Datos
        hotel1.editarDatos();        }
        hotel6.editarDatos();
        hotel7.editarDatos();

        //Mostrar
        hotel1.imprimirDatos();
        hotel2.imprimirDatos();
        hotel3.imprimirDatos();
        hotel4.imprimirDatos();
        hotel5.imprimirDatos();
        hotel6.imprimirDatos();
        hotel7.imprimirDatos();
    }
}