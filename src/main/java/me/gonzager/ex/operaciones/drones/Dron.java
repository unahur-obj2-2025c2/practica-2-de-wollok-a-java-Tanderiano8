package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public abstract class Dron  {
    protected Mision mision;
    protected Integer autonomia;
    protected Integer nivelDeProcesamiento;


    public Integer getAutonomia() {
        return autonomia;
    }

    public Mision getMision() {
        return mision;
    }
    public Dron(Mision mision, Integer autonomia, Integer nivelDeProcesamiento) {
        this.mision = mision;
        this.autonomia = autonomia;
        this.nivelDeProcesamiento = nivelDeProcesamiento;
    }


    public Dron(Integer autonomia, Integer nivelDeProcesamiento) {
        this.autonomia = autonomia;
        this.nivelDeProcesamiento = nivelDeProcesamiento;
    }

    public Integer getNivelDeProcesamiento() {
        return nivelDeProcesamiento;
    }

    public void setMision(Mision unaMision){
        this.mision = unaMision;
    }

    public Double eficienciaOperativa(){
        return autonomia * 10 + mision.eficienciaOperativa();
    }

    public Boolean esAvanzado(){
        return esAvanzadoSegunDron() || esAvanzadoSegunMision();
    }

    public abstract Boolean esAvanzadoSegunDron();

    public  Boolean esAvanzadoSegunMision(){
        return mision.esAvanzada(this);
    }

    public void setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
    }

}
