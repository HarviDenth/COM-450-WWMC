package com450.primerparcial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculoAreaCirculoTest {
CalculoAreaCirculo calcularArea = new CalculoAreaCirculo();
@DisplayName("test con radio positivo")
    @Test
    void testRadioPositivo() {
        assertEquals(78.54, calcularArea.radioPositivo(5),0.01);
    }
    @DisplayName("test con radio Cero")
    @Test
    void testRadioCero() {
        assertEquals(0, calcularArea.radioCero(0));
    }
    @DisplayName("test con radio negativo")
    @Test
    void testRadioNegativo() {
        assertEquals(-1, calcularArea.radioNegativo(-3));
    }
    @DisplayName("test con radio grande")
    @Test
    void testRadioGrande() {
        assertEquals(3141592.65, calcularArea.radioGrande(1000),0.01);
    }
    @DisplayName("test con radio decimal")
    @Test
    void testRadioDecimal() {
        assertEquals(19.63, calcularArea.radioDecimal(2.5),0.01);
    }
}
