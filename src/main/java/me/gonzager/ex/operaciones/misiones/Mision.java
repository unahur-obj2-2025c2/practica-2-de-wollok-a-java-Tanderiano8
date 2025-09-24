package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public interface Mision {

    Double eficienciaOperativa();

    Boolean esAvanzada(Dron unDron);

}
