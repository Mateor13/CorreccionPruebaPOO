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

}
