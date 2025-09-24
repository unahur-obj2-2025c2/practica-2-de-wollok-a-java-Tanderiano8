package me.gonzager.ex.operaciones.misiones;

import java.util.List;

import me.gonzager.ex.operaciones.drones.Dron;
import me.gonzager.ex.operaciones.sensores.Sensor;

public class MisionDeVigilancia implements Mision {
    List<Sensor> sensores;

    @Override
    public Double eficienciaOperativa() {
        return sensores.stream().mapToDouble(s -> s.eficiencia()).sum();
    }

    @Override
    public Boolean esAvanzada(Dron unDron) {
        return sensores.stream().allMatch(s -> s.esDuradero());
    }
}
