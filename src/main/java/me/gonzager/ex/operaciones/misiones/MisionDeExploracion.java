package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public class MisionDeExploracion implements Mision{

    @Override
    public Double eficienciaOperativa() {
         return 0.0;
    }

    @Override
    public Boolean esAvanzada(Dron unDron) {
        return unDron.eficienciaOperativa() % 2 == 0 ; 
    }
   

}
