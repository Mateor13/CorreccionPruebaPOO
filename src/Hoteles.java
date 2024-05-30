public class Hoteles {
    int numHabitaciones;
    String nombre;
    String ubicacion;
    Double calificacion;
    int numPisos;

    public Hoteles() {
    }

    public Hoteles(int numHabitaciones, String nombre, String ubicacion, Double calificacion, int numPisos) {
        this.numHabitaciones = numHabitaciones;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.calificacion = calificacion;
        this.numPisos = numPisos;
    }
    //Setters
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    //Getters
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public int getNumPisos() {
        return numPisos;
    }
    //Metodos personalizados
    //Editar los datos de una instancia
    public void editarDatos(int habitaciones, String nombre1, String ubicacion1, Double calificacion1){
        numHabitaciones = habitaciones;
        nombre = nombre1;
        ubicacion = ubicacion1;
        calificacion = calificacion1;
    }
    //Mostrar todos los valores
    public void imprimirDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Ubicacion: " + getUbicacion());
        System.out.println("Calificacion: " + getCalificacion());
        System.out.println("Num Habitaciones: " + getNumHabitaciones());
        System.out.println("Num Pisos: " + getNumPisos());
    }
    //Cambiar los datos por nulos
    public void datosNulos(){
        setNumHabitaciones(0);
        setNombre(null);
        setUbicacion(null);
        setCalificacion(null);
        setNumPisos(0);
        //hola////////
    }
    //Hola
}