package com450.primerparcial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumerosPrimosTest {
@DisplayName("caso de pueba 1 (n=7)")
    @Test
    void testPrimo7() {
        assertTrue(NumerosPrimos.esPrimo(7));
    }
    @DisplayName("caso de pueba 2 (n=6")
    @Test
    void testNoPrimo6() {
        assertFalse(NumerosPrimos.esPrimo(6));
    }
    @DisplayName("caso de pueba 3 (n=-3)")
    @Test
    void testNegativoNoPrimo() {
        assertFalse(NumerosPrimos.esPrimo(-3));
    }
    @DisplayName("caso de pueba 4 (n=997)")
    @Test
    void testPrimoGrande() {
        assertTrue(NumerosPrimos.esPrimo(997));
    }
    @DisplayName("caso de pueba 5 (n=0)")
    @Test
    void testCeroNoPrimo() {
        assertFalse(NumerosPrimos.esPrimo(0));
    }
}
