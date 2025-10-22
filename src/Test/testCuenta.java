package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class testCuenta {

	private static Cuenta cuenta;
	private static Cuenta cuenta12345;
	private static Cuenta cuenta67890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta(0.0,"0");
		cuenta12345 = new Cuenta(50.0, "12345");
		cuenta67890 = new Cuenta(0.0, "67890");
		System.out.println("Errores registrados");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}
	
	@Test
	void testIngresar() {
		cuenta.ingresar(200.0);
		assertEquals(200.0, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(200.0);
		assertEquals(-200.0, cuenta.getSaldo());
	}
	@Test
	void testInstruccion1() {
		//1.
		cuenta12345.retirar(200.0);
		assertEquals(-150.0, cuenta12345.getSaldo());		
	}
	
	@Test
	void testInstruccion2() {
		//2.
		cuenta67890.retirar(350.0);
		assertEquals(-350.0, cuenta67890.getSaldo());		
	}
	
	@Test
	void testInstruccion3() {
		//3.
		cuenta12345.ingresar(100.0);
		assertEquals(-50.0, cuenta12345.getSaldo());		
	}
	
	@Test
	void testInstruccion4() {
		//4.
		cuenta67890.retirar(200.0);
		assertEquals(-350.0, cuenta67890.getSaldo());	}
	
	@Test
	void testInstruccion5() {
		//5.
		cuenta67890.retirar(150.0);
		assertEquals(-500.0, cuenta67890.getSaldo());		
	}

	@Test
	void testInstruccion6() {
		//6.
		cuenta12345.retirar(200.0);
		assertEquals(-250.0, cuenta12345.getSaldo());		
	}
	
	@Test
	void testInstruccion7() {
		//7.
		cuenta67890.ingresar(50.0);
		assertEquals(-450.0, cuenta67890.getSaldo());		
	}
	
	@Test
	void testInstruccion8() {
		//8.
		cuenta67890.retirar(100.0);
		assertEquals(-450.0, cuenta67890.getSaldo());		
	}

}
