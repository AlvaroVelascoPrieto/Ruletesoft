package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*; 

import org.pmoo.ruleta.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ApuestaTest {
	
	Apuesta a1, a2, a3, a4;
	
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	
		a1 = null;
		a2 = null;
		a3 = null;
		a4 = null;
	
	}

	@Test
	public void testApuesta() {
		
		a1 = new Color(100, 1);
		a2 = new Docena(50, 2);
		a3 = new Paridad(75, 3);
		a4 = new Numero(30, 4);
		
		
		assertNotNull(a1);
		assertNotNull(a2);
		assertNotNull(a3);
		assertNotNull(a4);
	
	
	}

	@Test
	public void testDevolverPremio() {
		
		a1 = new Color(100, 1);
		a2 = new Docena(50, 2);
		a3 = new Paridad(75, 3);
		a4 = new Numero(30, 4);
		
		assertEquals(a1.devolverPremio(), 200);
		assertEquals(a2.devolverPremio(), 150);
		assertEquals(a3.devolverPremio(), 225);
		assertEquals(a4.devolverPremio(), 1080);
		
	}

	@Test
	public void testPremio() {
		a1 = new Color(100, 1);
		a2 = new Docena(50, 2);
		a3 = new Paridad(75, 2);
		a4 = new Numero(30, 4);
		
		a1.premio(1); //Simulamos que ha salido el número 1, el cual entra dentro de lo que hemos apostado
		assertEquals(a1.premio(1), 200);
		
		a1.premio(2); //Simulamos que ha salido el número 2, que no entra en nuestro rango de posibilidades
		assertEquals(a1.premio(2), 0); 
		
		assertEquals(a2.premio(22), 150); //Si sale el 22, estará en la segunda docena, a la que hemos apostado, con lo que nos devolverá el premio correspondiente
		assertEquals(a2.premio(2), 0); //Aquí no ganamos
		
		assertEquals(a3.premio(2), 225); //Apostamos a par
		assertEquals(a3.premio(11), 0); //Apostamos a par y sale un número impar
		
		assertEquals(a4.premio(4), 1080); //Apostamos al 4 y sale el 4
		assertEquals(a4.premio(2), 0);	  //No sale el número al que hemos apostado
		assertEquals(a4.premio(34), 0);
		
	}

}
