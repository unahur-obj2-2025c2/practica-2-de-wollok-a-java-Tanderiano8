package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public class MisionDeTransporte implements Mision{

    @Override
    public Double eficienciaOperativa() {
       return 100.0;
    }

    @Override
    public Boolean esAvanzada(Dron unDron) {
        return unDron.getAutonomia() > 50;
    }

}
