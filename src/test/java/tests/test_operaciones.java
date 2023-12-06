package tests;

import static org.junit.jupiter.api.Assertions.*;
import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;

class test_operaciones {

	@org.junit.jupiter.api.Test
    void testSuma1() {
        OperacionAritmetica suma = new OperacionAritmetica(new Sumar());
        assertEquals(3, suma.procesar(1, 2));
    }

	@org.junit.jupiter.api.Test
    void testSuma2() {
        OperacionAritmetica suma = new OperacionAritmetica(new Sumar());
        assertEquals(-1, suma.procesar(-67, 0));
    }
	
	@org.junit.jupiter.api.Test
    void testMultiplicacion1() {
        OperacionAritmetica multiplicacion = new OperacionAritmetica(new Multiplicacion());
        assertEquals(9, multiplicacion.procesar(9, 1));
    }
	
	@org.junit.jupiter.api.Test
    void testMultiplicacion2() {
        OperacionAritmetica multiplicacion = new OperacionAritmetica(new Multiplicacion());
        assertEquals(-1, multiplicacion.procesar(-5, 4));
    }
	
    @org.junit.jupiter.api.Test
    void testResta1() {
        OperacionAritmetica resta = new OperacionAritmetica(new Resta());
        assertEquals(29, resta.procesar(36, 7));
    }

    @org.junit.jupiter.api.Test
    void testResta2() {
        OperacionAritmetica resta = new OperacionAritmetica(new Resta());
        assertEquals(-2, resta.procesar(4, 20));
    }


    @org.junit.jupiter.api.Test
    void testDivision1() {
        OperacionAritmetica division = new OperacionAritmetica(new Division());
        assertEquals(2, division.procesar(8, 4));
    }

    @org.junit.jupiter.api.Test
    void testDivision2() {
        OperacionAritmetica division = new OperacionAritmetica(new Division());
        assertEquals(0, division.procesar(0, 100));
    }
    
    @org.junit.jupiter.api.Test
    void testDivision3() {
        OperacionAritmetica division = new OperacionAritmetica(new Division());
        assertEquals(-3, division.procesar(4, 0));
    }
}
