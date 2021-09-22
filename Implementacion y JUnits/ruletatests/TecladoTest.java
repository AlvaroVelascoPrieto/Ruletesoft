package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;

import static org.junit.Assert.*;
import org.pmoo.ruleta.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TecladoTest {
	
	Teclado t = Teclado.getTeclado();
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	t = null;
	}

	@Test
	public void testGetTeclado() {
		
		Teclado t2 = Teclado.getTeclado();
		
		assertNotNull(t2);
		assertNotNull(t);
	
	}

	@Test
	public void testLeerEntero() {

		t.leerEntero("Introduce un entero desde 10 hasta 50	", 10, 50); //Con un número que valga el comando acabará, si no, te pedirá otro.
		
	}

	@Test
	public void testLeerDouble() {
		System.out.print(t.leerDouble("Introduce un double del 1 al 10", 1, 10));
		
	}

	@Test
	public void testLeerSiNo() {
		assertEquals(t.leerSiNo("si"), true);
	}

	@Test
	public void testLeerString() {
		assertEquals(t.leerString("Como te llamas?"), "Como te llamas?");
	}
}




