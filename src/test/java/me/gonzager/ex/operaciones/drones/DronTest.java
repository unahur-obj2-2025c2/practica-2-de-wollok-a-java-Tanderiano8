package me.gonzager.ex.operaciones.drones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DronTest {

    @Test
    void queSePuedaInstanciarUnDronComercial() {
        Dron dronC = new DronComercial(15, 20);
        assertEquals(DronComercial.class, dronC.getClass());
    }

    @Test
    void queSePuedaInstanciarUnDronDeSeguridad() {
        Dron dronDS = new DronComercial(15, 20);
        assertEquals(DronDeSeguridad.class, dronDS.getClass());
    }

    @Test
    void eficienciaOperativaDronComercial() {
        Dron dronC = new DronComercial(15, 20);
        assertEquals(DronComercial.class, dronC.getClass());
    }

}
