package me.gonzager.ex.operaciones.zonas;

import me.gonzager.ex.operaciones.operaciones.Escuadron;

public class Zona {
    private Double tamanioTotal;
    private Double cantidadDeOperaciones;

    public Double getTamanioTotal() {
        return tamanioTotal;
    }

    public Double getCantidadDeOperaciones() {
        return cantidadDeOperaciones;
    }

    public void operarPorElEscuadron(Escuadron escuadron) {
        if(escuadron.puedeOperarEn(this)){
            cantidadDeOperaciones += 1;
            escuadron.getDrones().stream().forEach(d -> d.setAutonomia(d.getAutonomia() - 2));
        }
    }
}
