package me.gonzager.ex.operaciones.sensores;


public class Sensor {
    private final Double capacidad;
    private final Double durabilidad;
    private final Boolean conMejoras;
    

    public Sensor(Double capacidad, Double durabilidad, Boolean conMejoras) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.conMejoras = conMejoras;
    }


    public Double eficiencia() {
        return  !conMejoras ? capacidad : capacidad * 2;
    }


    public Boolean esDuradero() {
        return durabilidad > (capacidad * 2);
    }
}
