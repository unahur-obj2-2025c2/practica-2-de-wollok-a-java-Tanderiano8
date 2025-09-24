package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public class DronComercial extends Dron {

    public DronComercial(Integer autonomia, Integer nivelDeProcesamiento) {
        super(autonomia,nivelDeProcesamiento);
    }

    public DronComercial(Mision mision, Integer autonomia, Integer nivelDeProcesamiento) {
        super(mision, autonomia, nivelDeProcesamiento);
    }

    @Override
    public Double eficienciaOperativa() {
        return super.eficienciaOperativa() + 15.0; 
    }

    @Override
    public Boolean esAvanzadoSegunDron() {
        return Boolean.FALSE;
    }

   

    
    

}
