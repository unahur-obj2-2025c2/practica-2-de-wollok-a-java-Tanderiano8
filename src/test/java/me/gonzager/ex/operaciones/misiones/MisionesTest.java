package me.gonzager.ex.operaciones.misiones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import me.gonzager.ex.operaciones.drones.Dron;
import me.gonzager.ex.operaciones.drones.DronComercial;

public class MisionesTest {

    Dron dron;

    @Test
    void testEficienciaOperativaMisionDeExploracion(){
        Mision mision = new MisionDeExploracion();

        assertEquals(0.0, mision.eficienciaOperativa());
    }

    @Test
    void testEsAvanzada(){
        dron = new DronComercial(10, 15);
        Mision mision = new MisionDeExploracion();
        
        assertTrue(mision.esAvanzada(dron));
    }


}
