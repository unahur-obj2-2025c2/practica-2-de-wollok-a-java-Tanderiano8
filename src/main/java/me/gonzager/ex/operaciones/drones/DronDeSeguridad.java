package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public class DronDeSeguridad extends Dron {

    public DronDeSeguridad(Mision mision, Integer autonomia, Integer nivelDeProcesamiento) {
        super(mision, autonomia, nivelDeProcesamiento);
        //TODO Auto-generated constructor stub
    }

    public DronDeSeguridad(Integer autonomia, Integer nivelDeProcesamiento) {
        super(autonomia, nivelDeProcesamiento);
    }

    @Override
    public Boolean esAvanzadoSegunDron() {
        return nivelDeProcesamiento > 50;
    }

}
